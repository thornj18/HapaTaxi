package com.hapa.hapataxi;

import com.parse.Parse;

public class HapaTaxiApplication extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "z832OVKnyozQHna9nRSq2GXINEIB1Aob9DeHQzQY", "6udJ1wG79yNHToubXruVbjvvkXXdbnC9O5ue2lPT");
    }
}
