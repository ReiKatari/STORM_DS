package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import android.os.Build;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gd0  reason: default package */
/* loaded from: classes.dex */
public final class gd0 {
    public final rb0 a;
    public final bs0 b;
    public final an1 c;
    public final af0 d;
    public final ak7 e;
    public final in6 f;
    public final ce0 g;
    public final zg0 h;
    public final q03 i;
    public final bq0 j;
    public final DynamicRangeProfiles k;

    public gd0(rb0 rb0Var, bs0 bs0Var, an1 an1Var, af0 af0Var, ak7 ak7Var, in6 in6Var, ce0 ce0Var, zg0 zg0Var, q03 q03Var) {
        t71 i0;
        rb0Var.getClass();
        bs0Var.getClass();
        an1Var.getClass();
        af0Var.getClass();
        ak7Var.getClass();
        this.a = rb0Var;
        this.b = bs0Var;
        this.c = an1Var;
        this.d = af0Var;
        this.e = ak7Var;
        this.f = in6Var;
        this.g = ce0Var;
        this.h = zg0Var;
        this.i = q03Var;
        this.j = new bq0(21);
        int i = Build.VERSION.SDK_INT;
        DynamicRangeProfiles dynamicRangeProfiles = null;
        if (i >= 33 && ce0Var != null && (i0 = dt3.i0(ce0Var)) != null) {
            if (i >= 33) {
                dynamicRangeProfiles = ((vm1) i0.B).c();
            } else {
                c44.e(wh1.j("DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher. is not supported on API ", i, " (requires API 33)"));
                throw null;
            }
        }
        this.k = dynamicRangeProfiles;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x01ab, code lost:
        if (defpackage.nu.Z(r1, r15.a) == true) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0486  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0214  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.fd0 a(int r37, defpackage.d16 r38, boolean r39, defpackage.kn2 r40, java.lang.Integer r41, java.util.Map r42, java.util.Map r43) {
        /*
            Method dump skipped, instructions count: 1213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd0.a(int, d16, boolean, kn2, java.lang.Integer, java.util.Map, java.util.Map):fd0");
    }

    public final String toString() {
        return "CameraGraphConfigProvider<" + ((Object) od0.b(this.c.B)) + '>';
    }
}
