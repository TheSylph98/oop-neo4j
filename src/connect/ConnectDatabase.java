import org.neo4j.graphdb.*;
import java.io.File;
import java.io.IOException;
import org.neo4j.io.fs.FileUtils;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.Transaction;
import org.neo4j.graphdb.factory.GraphDatabaseFactory;

public class ConnectDatabase {
	    CreateEntity entity = new CreateEntity();
	    private static final File databaseDirectory = new File( "Target/neo4j-db" );
	    GraphDatabaseService graphDb;
	    void createDb() throws IOException {
	    FileUtils.deleteRecursively( databaseDirectory );
        // START SNIPPET: startDb
        graphDb = new GraphDatabaseFactory().newEmbeddedDatabase( databaseDirectory );
        registerShutdownHook( graphDb );
	    }
        // END SNIPPET: startDb 
	
	    public Node CreateNodePreson(Person p1) {
	    
	    	Node n;
	    	try ( Transaction tx = graphDb.beginTx() )
	        {
	            n = graphDb.createNode();
	            n.setProperty( "Dinhdanh", p1.getDinhdanh() );
	            n.setProperty("Nhan", p1.getNhan());
	            n.setProperty("Mota", p1.getMota());
	            n.setProperty("Link",p1.getLink());
	            n.setProperty("Age",p1.getAge());
	            n.setProperty("Job", p1.getJob());
	            n.setProperty("Quoctich", p1.getQuoctich());
	            tx.success();
	        }
	    	return n;
	    };
	    public Node CreateNodeLocation(Location l1) {
	    	Node n;
	    	try ( Transaction tx = graphDb.beginTx() )
	        {
	            n = graphDb.createNode();
	            n.setProperty( "Dinhdanh", l1.getDinhdanh() );
	            n.setProperty("Nhan", l1.getNhan());
	            n.setProperty("Mota", l1.getMota());
	            n.setProperty("Link",l1.getLink());
	            n.setProperty("Quocgia", l1.getQuocgia());
	            tx.success();
	        }
	    	return n;
	    };
	    void CreateGraph() {
	    	 try ( Transaction tx = graphDb.beginTx() ){
	    	Node p1 = CreateNodePreson(entity.CreatePerson1());
	    	Node l1 = CreateNodeLocation(entity.CreateLocation1());
	    	//Relationship relationship= p1.createRelationshipTo(l1, RelTypes.LIVE);
	    //	relationship.setProperty("Since", "2016");
	    	tx.success();
	    	 }
	    }
	    void shutDown()
	    {
	        System.out.println( "Shutting down database ..." );
	        // START SNIPPET: shutdownServer
	        try
	        {
	            if ( graphDb != null )
	            {
	                graphDb.shutdown();
	            }
	        }
	        finally
	        {
	            graphDb = null;
	        };
	        // END SNIPPET: shutdownServer
	    }
	  // START SNIPPET: shutdownHook
	   private static void registerShutdownHook( final GraphDatabaseService graphDb )
	    {
	        Runtime.getRuntime().addShutdownHook( new Thread()
	        {
	            @Override
	            public void run()
	            {
	                graphDb.shutdown();
	            }
	        } );
	    }
	  
}
