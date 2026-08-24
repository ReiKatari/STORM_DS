package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ic1  reason: default package */
/* loaded from: classes.dex */
public final class ic1 {
    public static final ic1 a = new Object();
    public static final hb4 b = new hb4();

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        if (r6.e(r0) == r8) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Type inference failed for: r1v3, types: [fb4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ad adVar, s41 s41Var) {
        hc1 hc1Var;
        x61 x61Var;
        int i;
        hb4 hb4Var;
        int i2;
        fb4 fb4Var;
        Throwable th;
        Object g;
        try {
            if (s41Var instanceof hc1) {
                hc1Var = (hc1) s41Var;
                int i3 = hc1Var.e0;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    hc1Var.e0 = i3 - Integer.MIN_VALUE;
                    Object obj = hc1Var.Z;
                    x61Var = x61.COROUTINE_SUSPENDED;
                    i = hc1Var.e0;
                    if (i == 0) {
                        if (i != 1) {
                            if (i == 2) {
                                fb4Var = hc1Var.X;
                                try {
                                    oi2.Y(obj);
                                    fb4Var.h(null);
                                    return obj;
                                } catch (Throwable th2) {
                                    th = th2;
                                    fb4Var.h(null);
                                    throw th;
                                }
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        int i4 = hc1Var.Y;
                        ?? r1 = hc1Var.X;
                        ad adVar2 = hc1Var.R;
                        oi2.Y(obj);
                        hb4Var = r1;
                        i2 = i4;
                        adVar = adVar2;
                    } else {
                        oi2.Y(obj);
                        hc1Var.R = adVar;
                        hb4Var = b;
                        hc1Var.X = hb4Var;
                        i2 = 0;
                        hc1Var.Y = 0;
                        hc1Var.e0 = 1;
                    }
                    hc1Var.R = null;
                    hc1Var.X = hb4Var;
                    hc1Var.Y = i2;
                    hc1Var.e0 = 2;
                    g = adVar.g(hc1Var);
                    if (g != x61Var) {
                        fb4Var = hb4Var;
                        obj = g;
                        fb4Var.h(null);
                        return obj;
                    }
                    return x61Var;
                }
            }
            hc1Var.R = null;
            hc1Var.X = hb4Var;
            hc1Var.Y = i2;
            hc1Var.e0 = 2;
            g = adVar.g(hc1Var);
            if (g != x61Var) {
            }
            return x61Var;
        } catch (Throwable th3) {
            fb4Var = hb4Var;
            th = th3;
            fb4Var.h(null);
            throw th;
        }
        hc1Var = new hc1(this, s41Var);
        Object obj2 = hc1Var.Z;
        x61Var = x61.COROUTINE_SUSPENDED;
        i = hc1Var.e0;
        if (i == 0) {
        }
    }
}
