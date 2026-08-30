package me.magnum.melonds.debug;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.List;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class DebugCommandInitializer implements gz2 {
    public static final void c(DebugCommandInitializer debugCommandInitializer, Context context, Activity activity) {
        Uri data;
        if (activity instanceof EmulatorActivity) {
            u81 u81Var = u81.a;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            EmulatorActivity emulatorActivity = (EmulatorActivity) activity;
            u81.b = new WeakReference(emulatorActivity);
            Intent intent = emulatorActivity.getIntent();
            if (intent != null && (data = intent.getData()) != null) {
                SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("debug_command_state", 0);
                sharedPreferences.getClass();
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString("last_rom_uri", data.toString());
                edit.commit();
            }
        }
    }

    @Override // defpackage.gz2
    public final List a() {
        return pp1.A;
    }

    @Override // defpackage.gz2
    public final Object b(Context context) {
        Application application;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        } else {
            application = null;
        }
        if (application != null) {
            application.registerActivityLifecycleCallbacks(new s81(this, context));
        }
        return o27.a;
    }
}
