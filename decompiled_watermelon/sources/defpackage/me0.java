package defpackage;

import android.os.Trace;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: me0  reason: default package */
/* loaded from: classes.dex */
public abstract class me0 {
    public static final cw a = w81.f(0);

    public static final ke0 a(ge0 ge0Var) {
        try {
            Trace.beginSection("CameraPipe");
            w71 w71Var = new w71(new bq0(16, ge0Var), new xn1(ge0Var.b));
            Trace.endSection();
            return new ke0(w71Var);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
