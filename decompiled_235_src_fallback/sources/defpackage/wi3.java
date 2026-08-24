package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wi3  reason: default package */
/* loaded from: classes.dex */
public final class wi3 extends defpackage.nc2 {
    public static final int[] B = null;
    public int A;

    static {
            r0 = 10
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA  , data: [262144, 1048576, 2097152, 4194304, 4194304, 8388608, 8388608, 16777216, 33554432, 67108864} // fill-array
            defpackage.wi3.B = r0
            return
    }

    @Override // defpackage.nc2
    public final java.io.InputStream a(java.io.InputStream r2, defpackage.mu r3) {
            r1 = this;
            vi3 r0 = new vi3
            int r1 = r1.A
            r0.<init>(r2, r1, r3)
            return r0
    }

    public final java.lang.Object clone() {
            r0 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L5
            return r0
        L5:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
    }
}
