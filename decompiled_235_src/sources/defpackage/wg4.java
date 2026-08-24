package defpackage;

import android.app.PendingIntent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.core.graphics.drawable.IconCompat;
import com.stormds.emulator.R;
import java.lang.reflect.InvocationTargetException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wg4  reason: default package */
/* loaded from: classes.dex */
public final class wg4 {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wg4(String str, PendingIntent pendingIntent) {
        IconCompat b = IconCompat.b(null, "", R.drawable.common_full_open_on_phone);
        Bundle bundle = new Bundle();
        this.d = true;
        this.b = b;
        int i = b.a;
        if (i == -1) {
            Object obj = b.b;
            if (Build.VERSION.SDK_INT >= 28) {
                i = pp.r(obj);
            } else {
                try {
                    i = ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
                } catch (IllegalAccessException e) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e);
                    i = -1;
                    if (i == 2) {
                    }
                    this.f = xg4.b(str);
                    this.g = pendingIntent;
                    this.a = bundle;
                    this.c = true;
                    this.d = true;
                } catch (NoSuchMethodException e2) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e2);
                    i = -1;
                    if (i == 2) {
                    }
                    this.f = xg4.b(str);
                    this.g = pendingIntent;
                    this.a = bundle;
                    this.c = true;
                    this.d = true;
                } catch (InvocationTargetException e3) {
                    Log.e("IconCompat", "Unable to get icon type " + obj, e3);
                    i = -1;
                    if (i == 2) {
                    }
                    this.f = xg4.b(str);
                    this.g = pendingIntent;
                    this.a = bundle;
                    this.c = true;
                    this.d = true;
                }
            }
        }
        if (i == 2) {
            this.e = b.c();
        }
        this.f = xg4.b(str);
        this.g = pendingIntent;
        this.a = bundle;
        this.c = true;
        this.d = true;
    }
}
