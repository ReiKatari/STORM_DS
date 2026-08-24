package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iu6  reason: default package */
/* loaded from: classes.dex */
public final class iu6 implements android.view.MenuItem.OnMenuItemClickListener {
    public static final java.lang.Class[] R = null;
    public final /* synthetic */ int A;
    public java.lang.Object B;
    public java.lang.Object L;

    static {
            java.lang.Class<android.view.MenuItem> r0 = android.view.MenuItem.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0}
            defpackage.iu6.R = r0
            return
    }

    public /* synthetic */ iu6() {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            return
    }

    public iu6(defpackage.s44 r2, android.view.MenuItem.OnMenuItemClickListener r3) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            return
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem r4) {
            r3 = this;
            int r0 = r3.A
            switch(r0) {
                case 0: goto L16;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.B
            android.view.MenuItem$OnMenuItemClickListener r0 = (android.view.MenuItem.OnMenuItemClickListener) r0
            java.lang.Object r3 = r3.L
            s44 r3 = (defpackage.s44) r3
            android.view.MenuItem r3 = r3.h(r4)
            boolean r3 = r0.onMenuItemClick(r3)
            return r3
        L16:
            java.lang.Object r0 = r3.B
            java.lang.Object r3 = r3.L
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            java.lang.Class r1 = r3.getReturnType()     // Catch: java.lang.Exception -> L3c
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> L3c
            if (r1 != r2) goto L33
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L3c
            java.lang.Object r3 = r3.invoke(r0, r4)     // Catch: java.lang.Exception -> L3c
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch: java.lang.Exception -> L3c
            boolean r3 = r3.booleanValue()     // Catch: java.lang.Exception -> L3c
            goto L3b
        L33:
            java.lang.Object[] r4 = new java.lang.Object[]{r4}     // Catch: java.lang.Exception -> L3c
            r3.invoke(r0, r4)     // Catch: java.lang.Exception -> L3c
            r3 = 1
        L3b:
            return r3
        L3c:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
    }
}
