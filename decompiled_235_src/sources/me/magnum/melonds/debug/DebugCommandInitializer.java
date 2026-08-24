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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class DebugCommandInitializer implements j53 {
    public static final void c(DebugCommandInitializer debugCommandInitializer, Context context, Activity activity) {
        Uri data;
        if (activity instanceof EmulatorActivity) {
            lc1 lc1Var = lc1.a;
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            EmulatorActivity emulatorActivity = (EmulatorActivity) activity;
            lc1.b = new WeakReference(emulatorActivity);
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

    @Override // defpackage.j53
    public final List a() {
        return yt1.A;
    }

    @Override // defpackage.j53
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
            application.registerActivityLifecycleCallbacks(new jc1(this, context));
        }
        return jg7.a;
    }
}
