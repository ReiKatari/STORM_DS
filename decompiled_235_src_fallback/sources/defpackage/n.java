package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n  reason: default package */
/* loaded from: classes.dex */
public final class n extends defpackage.nc2 {
    public final /* synthetic */ int A;

    public /* synthetic */ n(int r1) {
            r0 = this;
            r0.A = r1
            r0.<init>()
            return
    }

    @Override // defpackage.nc2
    public final java.io.InputStream a(java.io.InputStream r3, defpackage.mu r4) {
            r2 = this;
            int r2 = r2.A
            r4 = 0
            switch(r2) {
                case 0: goto L4e;
                case 1: goto L40;
                case 2: goto L32;
                case 3: goto L24;
                case 4: goto L16;
                default: goto L6;
            }
        L6:
            fi6 r2 = new fi6
            dy7 r0 = new dy7
            r0.<init>()
            r0.b = r4
            r4 = 5
            r0.a = r4
            r2.<init>(r3, r0)
            return r2
        L16:
            fi6 r2 = new fi6
            ga0 r0 = new ga0
            r1 = 7
            r0.<init>(r1)
            r0.b = r4
            r2.<init>(r3, r0)
            return r2
        L24:
            fi6 r2 = new fi6
            ga0 r0 = new ga0
            r1 = 6
            r0.<init>(r1)
            r0.b = r4
            r2.<init>(r3, r0)
            return r2
        L32:
            fi6 r2 = new fi6
            ga0 r0 = new ga0
            r1 = 1
            r0.<init>(r1)
            r0.b = r4
            r2.<init>(r3, r0)
            return r2
        L40:
            fi6 r2 = new fi6
            ga0 r4 = new ga0
            r0 = 4
            r4.<init>(r0)
            r4.b = r0
            r2.<init>(r3, r4)
            return r2
        L4e:
            fi6 r2 = new fi6
            ga0 r4 = new ga0
            r0 = 3
            r4.<init>(r0)
            r0 = 8
            r4.b = r0
            r2.<init>(r3, r4)
            return r2
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
