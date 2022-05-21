package com.tarunuba;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class Main {

    public static void main(String[] args) {
	MongoClient client = MongoClients.create("mongodb+srv://TarunUba:qwert@cluster0.bm5ln.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
        MongoDatabase db = client.getDatabase("sampleDB");
        MongoCollection col = db.getCollection("sampleCollection");
        Document sampleDoc = new Document("_id","1").append("name","John Smith");
        col.insertOne(sampleDoc);
    }
}
