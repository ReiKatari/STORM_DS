package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ru  reason: default package */
/* loaded from: classes.dex */
public final class ru extends defpackage.ct0 {
    public final /* synthetic */ int b;
    public final defpackage.sw3 c;

    public ru(defpackage.gg3 r2, int r3) {
            r1 = this;
            r1.b = r3
            r2.getClass()
            switch(r3) {
                case 1: goto L2e;
                case 2: goto L1b;
                default: goto L8;
            }
        L8:
            r1.<init>(r2)
            nu r3 = new nu
            wb6 r2 = r2.e()
            r2.getClass()
            r0 = 1
            r3.<init>(r2, r0)
            r1.c = r3
            return
        L1b:
            r1.<init>(r2)
            nu r3 = new nu
            wb6 r2 = r2.e()
            r2.getClass()
            r0 = 3
            r3.<init>(r2, r0)
            r1.c = r3
            return
        L2e:
            r1.<init>(r2)
            nu r3 = new nu
            wb6 r2 = r2.e()
            r2.getClass()
            r0 = 2
            r3.<init>(r2, r0)
            r1.c = r3
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r1 = this;
            int r0 = r1.b
            switch(r0) {
                case 0: goto Lf;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            sw3 r1 = r1.c
            nu r1 = (defpackage.nu) r1
            return r1
        La:
            sw3 r1 = r1.c
            nu r1 = (defpackage.nu) r1
            return r1
        Lf:
            sw3 r1 = r1.c
            nu r1 = (defpackage.nu) r1
            return r1
    }

    @Override // defpackage.m0
    public final java.lang.Object f() {
            r0 = this;
            int r0 = r0.b
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lb;
                default: goto L5;
            }
        L5:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            return r0
        Lb:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            return r0
        L11:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @Override // defpackage.m0
    public final int g(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.b
            switch(r0) {
                case 0: goto L19;
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            r1.getClass()
            int r0 = r1.size()
            return r0
        Lf:
            java.util.HashSet r1 = (java.util.HashSet) r1
            r1.getClass()
            int r0 = r1.size()
            return r0
        L19:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.getClass()
            int r0 = r1.size()
            return r0
    }

    @Override // defpackage.m0
    public final java.util.Iterator h(java.lang.Object r1) {
            r0 = this;
            java.util.Collection r1 = (java.util.Collection) r1
            r1.getClass()
            java.util.Iterator r0 = r1.iterator()
            return r0
    }

    @Override // defpackage.m0
    public final int i(java.lang.Object r1) {
            r0 = this;
            java.util.Collection r1 = (java.util.Collection) r1
            r1.getClass()
            int r0 = r1.size()
            return r0
    }

    @Override // defpackage.m0
    public final java.lang.Object l(java.lang.Object r2) {
            r1 = this;
            int r1 = r1.b
            r0 = 0
            switch(r1) {
                case 0: goto L32;
                case 1: goto L1c;
                default: goto L6;
            }
        L6:
            java.util.Set r2 = (java.util.Set) r2
            r2.getClass()
            boolean r1 = r2 instanceof java.util.LinkedHashSet
            if (r1 == 0) goto L12
            r0 = r2
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
        L12:
            if (r0 != 0) goto L1b
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            java.util.Collection r2 = (java.util.Collection) r2
            r0.<init>(r2)
        L1b:
            return r0
        L1c:
            java.util.Set r2 = (java.util.Set) r2
            r2.getClass()
            boolean r1 = r2 instanceof java.util.HashSet
            if (r1 == 0) goto L28
            r0 = r2
            java.util.HashSet r0 = (java.util.HashSet) r0
        L28:
            if (r0 != 0) goto L31
            java.util.HashSet r0 = new java.util.HashSet
            java.util.Collection r2 = (java.util.Collection) r2
            r0.<init>(r2)
        L31:
            return r0
        L32:
            java.util.List r2 = (java.util.List) r2
            r2.getClass()
            boolean r1 = r2 instanceof java.util.ArrayList
            if (r1 == 0) goto L3e
            r0 = r2
            java.util.ArrayList r0 = (java.util.ArrayList) r0
        L3e:
            if (r0 != 0) goto L45
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r2)
        L45:
            return r0
    }

    @Override // defpackage.m0
    public final java.lang.Object m(java.lang.Object r1) {
            r0 = this;
            int r0 = r0.b
            switch(r0) {
                case 0: goto L11;
                case 1: goto Lb;
                default: goto L5;
            }
        L5:
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            r1.getClass()
            return r1
        Lb:
            java.util.HashSet r1 = (java.util.HashSet) r1
            r1.getClass()
            return r1
        L11:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            r1.getClass()
            return r1
    }

    @Override // defpackage.ct0
    public final void n(int r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            int r0 = r0.b
            switch(r0) {
                case 0: goto L17;
                case 1: goto Le;
                default: goto L5;
            }
        L5:
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            r2.getClass()
            r2.add(r3)
            return
        Le:
            java.util.HashSet r2 = (java.util.HashSet) r2
            r2.getClass()
            r2.add(r3)
            return
        L17:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            r2.getClass()
            r2.add(r1, r3)
            return
    }
}
