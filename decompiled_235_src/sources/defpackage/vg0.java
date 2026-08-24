package defpackage;

import android.os.Trace;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vg0  reason: default package */
/* loaded from: classes.dex */
public abstract class vg0 {
    public static final uw a = g04.t(0);

    public static final tg0 a(pg0 pg0Var) {
        try {
            Trace.beginSection("CameraPipe");
            nb1 nb1Var = new nb1(new os0(pg0Var, 17), new gs1(pg0Var.b));
            Trace.endSection();
            return new tg0(nb1Var);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }
}
