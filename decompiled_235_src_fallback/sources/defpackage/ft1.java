package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ft1  reason: default package */
/* loaded from: classes.dex */
public final class ft1 implements android.text.method.KeyListener {
    public final android.text.method.KeyListener a;

    public ft1(android.text.method.KeyListener r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(android.view.View r1, android.text.Editable r2, int r3) {
            r0 = this;
            android.text.method.KeyListener r0 = r0.a
            r0.clearMetaKeyState(r1, r2, r3)
            return
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
            r0 = this;
            android.text.method.KeyListener r0 = r0.a
            int r0 = r0.getInputType()
            return r0
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(android.view.View r4, android.text.Editable r5, int r6, android.view.KeyEvent r7) {
            r3 = this;
            r0 = 67
            r1 = 1
            r2 = 0
            if (r6 == r0) goto L11
            r0 = 112(0x70, float:1.57E-43)
            if (r6 == r0) goto Lc
            r0 = r2
            goto L15
        Lc:
            boolean r0 = defpackage.bt.C(r5, r7, r1)
            goto L15
        L11:
            boolean r0 = defpackage.bt.C(r5, r7, r2)
        L15:
            if (r0 == 0) goto L1b
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r5)
            return r1
        L1b:
            android.text.method.KeyListener r3 = r3.a
            boolean r3 = r3.onKeyDown(r4, r5, r6, r7)
            if (r3 == 0) goto L24
            return r1
        L24:
            return r2
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(android.view.View r1, android.text.Editable r2, android.view.KeyEvent r3) {
            r0 = this;
            android.text.method.KeyListener r0 = r0.a
            boolean r0 = r0.onKeyOther(r1, r2, r3)
            return r0
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(android.view.View r1, android.text.Editable r2, int r3, android.view.KeyEvent r4) {
            r0 = this;
            android.text.method.KeyListener r0 = r0.a
            boolean r0 = r0.onKeyUp(r1, r2, r3, r4)
            return r0
    }
}
