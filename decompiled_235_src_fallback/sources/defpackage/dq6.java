package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dq6  reason: default package */
/* loaded from: classes.dex */
public final class dq6 extends defpackage.u0 implements java.util.Iterator, defpackage.zf3 {
    public final /* synthetic */ int Z;

    public /* synthetic */ dq6(defpackage.om6 r1, java.util.Iterator r2, int r3) {
            r0 = this;
            r0.Z = r3
            r0.<init>(r1, r2)
            return
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            int r0 = r2.Z
            r1 = 0
            switch(r0) {
                case 0: goto L2a;
                case 1: goto L18;
                default: goto L6;
            }
        L6:
            java.lang.Object r0 = r2.Y
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L14
            r2.a()
            java.lang.Object r1 = r0.getValue()
            goto L17
        L14:
            defpackage.e41.m()
        L17:
            return r1
        L18:
            java.lang.Object r0 = r2.Y
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L26
            r2.a()
            java.lang.Object r1 = r0.getKey()
            goto L29
        L26:
            defpackage.e41.m()
        L29:
            return r1
        L2a:
            r2.a()
            java.lang.Object r0 = r2.X
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            if (r0 == 0) goto L39
            cq6 r1 = new cq6
            r1.<init>(r2)
            goto L3c
        L39:
            defpackage.e41.m()
        L3c:
            return r1
    }
}
