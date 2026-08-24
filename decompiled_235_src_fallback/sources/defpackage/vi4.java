package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vi4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vi4 implements defpackage.r45 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ vi4(int r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ java.lang.Class annotationType() {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            java.lang.Class<r45> r0 = defpackage.r45.class
            return r0
        L8:
            java.lang.Class<r45> r0 = defpackage.r45.class
            return r0
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            int r0 = r3.a
            r1 = 1
            int r3 = r3.b
            r2 = 0
            switch(r0) {
                case 0: goto L18;
                default: goto L9;
            }
        L9:
            boolean r0 = r4 instanceof defpackage.r45
            if (r0 != 0) goto Le
            goto L16
        Le:
            r45 r4 = (defpackage.r45) r4
            int r4 = r4.number()
            if (r3 == r4) goto L17
        L16:
            r1 = r2
        L17:
            return r1
        L18:
            boolean r0 = r4 instanceof defpackage.r45
            if (r0 != 0) goto L1d
            goto L25
        L1d:
            r45 r4 = (defpackage.r45) r4
            int r4 = r4.number()
            if (r3 == r4) goto L26
        L25:
            r1 = r2
        L26:
            return r1
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            int r1 = r1.b
            int r1 = java.lang.Integer.hashCode(r1)
        Lb:
            r0 = 1779747127(0x6a14c937, float:4.496781E25)
            r1 = r1 ^ r0
            return r1
        L10:
            int r1 = r1.b
            int r1 = java.lang.Integer.hashCode(r1)
            goto Lb
    }

    @Override // defpackage.r45
    public final /* synthetic */ int number() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            int r1 = r1.b
            return r1
        L8:
            int r1 = r1.b
            return r1
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.String toString() {
            r2 = this;
            int r0 = r2.a
            switch(r0) {
                case 0: goto L10;
                default: goto L5;
            }
        L5:
            java.lang.String r0 = "@kotlinx.serialization.protobuf.ProtoNumber(number="
            java.lang.String r1 = ")"
            int r2 = r2.b
            java.lang.String r2 = defpackage.lb1.k(r0, r2, r1)
            return r2
        L10:
            java.lang.String r0 = "@kotlinx.serialization.protobuf.ProtoNumber(number="
            java.lang.String r1 = ")"
            int r2 = r2.b
            java.lang.String r2 = defpackage.lb1.k(r0, r2, r1)
            return r2
    }
}
