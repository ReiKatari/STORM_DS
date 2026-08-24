package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ek0  reason: default package */
/* loaded from: classes.dex */
public final class ek0 {
    public static final defpackage.xx f = null;
    public final java.util.ArrayList a;
    public final defpackage.go4 b;
    public final int c;
    public final java.util.List d;
    public final defpackage.sy6 e;

    static {
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.captureConfig.rotation"
            java.lang.Class r2 = java.lang.Integer.TYPE
            r3 = 0
            r0.<init>(r1, r2, r3)
            java.lang.Class<java.lang.Integer> r0 = java.lang.Integer.class
            xx r1 = new xx
            java.lang.String r2 = "camerax.core.captureConfig.jpegQuality"
            r1.<init>(r2, r0, r3)
            xx r0 = new xx
            java.lang.String r1 = "camerax.core.captureConfig.resolvedFrameRate"
            java.lang.Class<android.util.Range> r2 = android.util.Range.class
            r0.<init>(r1, r2, r3)
            defpackage.ek0.f = r0
            return
    }

    public ek0(java.util.ArrayList r1, defpackage.go4 r2, int r3, java.util.ArrayList r4, defpackage.sy6 r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            java.util.List r1 = java.util.Collections.unmodifiableList(r4)
            r0.d = r1
            r0.e = r5
            return
    }

    public final android.util.Range a() {
            r2 = this;
            xx r0 = defpackage.ek0.f
            android.util.Range r1 = defpackage.yy.h
            go4 r2 = r2.b
            java.lang.Object r2 = r2.b(r0, r1)
            android.util.Range r2 = (android.util.Range) r2
            java.util.Objects.requireNonNull(r2)
            return r2
    }
}
