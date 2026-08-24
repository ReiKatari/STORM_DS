package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q  reason: default package */
/* loaded from: classes.dex */
public final class q implements defpackage.kp7 {
    public int a;
    public boolean b;
    public java.lang.Object c;

    @Override // defpackage.kp7
    public void a() {
            r1 = this;
            r0 = 1
            r1.b = r0
            return
    }

    @Override // defpackage.kp7
    public void b() {
            r1 = this;
            java.lang.Object r0 = r1.c
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            androidx.appcompat.widget.ActionBarContextView.a(r0)
            r0 = 0
            r1.b = r0
            return
    }

    @Override // defpackage.kp7
    public void c() {
            r2 = this;
            boolean r0 = r2.b
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.Object r0 = r2.c
            androidx.appcompat.widget.ActionBarContextView r0 = (androidx.appcompat.widget.ActionBarContextView) r0
            r1 = 0
            r0.e0 = r1
            int r2 = r2.a
            androidx.appcompat.widget.ActionBarContextView.b(r0, r2)
            return
    }

    public void d(java.lang.Object r7) {
            r6 = this;
            r7.getClass()
            int r0 = r6.a
            int r1 = r0 + 1
            java.lang.Object r2 = r6.c
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r3 = r2.length
            r4 = 0
            if (r3 >= r1) goto L2a
            int r5 = r3 >> 1
            int r3 = r3 + r5
            int r3 = r3 + 1
            if (r3 >= r1) goto L1c
            int r0 = java.lang.Integer.highestOneBit(r0)
            int r3 = r0 + r0
        L1c:
            if (r3 >= 0) goto L21
            r3 = 2147483647(0x7fffffff, float:NaN)
        L21:
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r2, r3)
            r6.c = r0
            r6.b = r4
            goto L38
        L2a:
            boolean r0 = r6.b
            if (r0 == 0) goto L38
            java.lang.Object r0 = r2.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r6.c = r0
            r6.b = r4
        L38:
            java.lang.Object r0 = r6.c
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r1 = r6.a
            int r2 = r1 + 1
            r6.a = r2
            r0[r1] = r7
            return
    }
}
