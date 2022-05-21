import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;

public class MongoDB {
    public static MongoClient mongoClient;
    public static MongoDatabase database;
    public static MongoCollection test;
    public static void main(String[] args){
        mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        database = mongoClient.getDatabase("MongoDBTutorial");
        test = database.getCollection("test");
        TestObject testObject = new TestObject();
        testObject.setMemberID("abc");
        testObject.setTimer(1);
        testObject.setXP(12434);
        test.insertOne(convert(testObject));
        DBObject query = new BasicDBObject("XP",12434);
        MongoCursor cursor = (MongoCursor) test.find((Bson) query);
        System.out.println(cursor.next());
    }
    public static DBObject convert(TestObject testObject){
        return new BasicDBObject("XP",testObject.getXP()).append("Timer",testObject.getTimer()).append("memberID",testObject.getMemberID());
    }
}
