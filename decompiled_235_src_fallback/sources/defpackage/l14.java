package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l14  reason: default package */
/* loaded from: classes.dex */
public final class l14 extends defpackage.z0 {
    public final /* synthetic */ int A;
    public final java.lang.Object B;

    public l14(java.util.List r2) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r2.getClass()
            r1.<init>()
            r1.B = r2
            return
    }

    public l14(defpackage.n14 r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.B = r2
            return
    }

    @Override // defpackage.l0
    public final int a() {
            r1 = this;
            int r0 = r1.A
            java.lang.Object r1 = r1.B
            switch(r0) {
                case 0: goto Le;
                default: goto L7;
            }
        L7:
            java.util.List r1 = (java.util.List) r1
            int r1 = r1.size()
            return r1
        Le:
            n14 r1 = (defpackage.n14) r1
            java.util.regex.Matcher r1 = r1.a
            int r1 = r1.groupCount()
            int r1 = r1 + 1
            return r1
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r1 = super.contains(r2)
            return r1
        La:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L10
            r1 = 0
            goto L16
        L10:
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = super.contains(r2)
        L16:
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            int r0 = r2.A
            java.lang.Object r1 = r2.B
            switch(r0) {
                case 0: goto L12;
                default: goto L7;
            }
        L7:
            java.util.List r1 = (java.util.List) r1
            int r2 = defpackage.gt0.y0(r3, r2)
            java.lang.Object r2 = r1.get(r2)
            return r2
        L12:
            n14 r1 = (defpackage.n14) r1
            java.util.regex.Matcher r2 = r1.a
            java.lang.String r2 = r2.group(r3)
            if (r2 != 0) goto L1e
            java.lang.String r2 = ""
        L1e:
            return r2
    }

    @Override // defpackage.z0, java.util.List
    public /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = super.indexOf(r2)
            return r1
        La:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L10
            r1 = -1
            goto L16
        L10:
            java.lang.String r2 = (java.lang.String) r2
            int r1 = super.indexOf(r2)
        L16:
            return r1
    }

    @Override // defpackage.z0, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.util.Iterator r2 = super.iterator()
            return r2
        La:
            qp5 r0 = new qp5
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // defpackage.z0, java.util.List
    public /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = super.lastIndexOf(r2)
            return r1
        La:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 != 0) goto L10
            r1 = -1
            goto L16
        L10:
            java.lang.String r2 = (java.lang.String) r2
            int r1 = super.lastIndexOf(r2)
        L16:
            return r1
    }

    @Override // defpackage.z0, java.util.List
    public java.util.ListIterator listIterator() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.util.ListIterator r2 = super.listIterator()
            return r2
        La:
            qp5 r0 = new qp5
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // defpackage.z0, java.util.List
    public java.util.ListIterator listIterator(int r2) {
            r1 = this;
            int r0 = r1.A
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.util.ListIterator r1 = super.listIterator(r2)
            return r1
        La:
            qp5 r0 = new qp5
            r0.<init>(r1, r2)
            return r0
    }
}
