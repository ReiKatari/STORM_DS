package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e54  reason: default package */
/* loaded from: classes.dex */
public class e54 extends defpackage.d2 implements android.view.Menu {
    public final defpackage.i44 c;

    public e54(android.content.Context r1, defpackage.i44 r2) {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto L8
            r0.c = r2
            return
        L8:
            java.lang.String r0 = "Wrapped Object can not be null."
            defpackage.i.h(r0)
            r0 = 0
            throw r0
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int r2) {
            r1 = this;
            i44 r0 = r1.c
            android.view.MenuItem r2 = r0.add(r2)
            android.view.MenuItem r1 = r1.h(r2)
            return r1
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int r2, int r3, int r4, int r5) {
            r1 = this;
            i44 r0 = r1.c
            android.view.MenuItem r2 = r0.add(r2, r3, r4, r5)
            android.view.MenuItem r1 = r1.h(r2)
            return r1
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int r2, int r3, int r4, java.lang.CharSequence r5) {
            r1 = this;
            i44 r0 = r1.c
            o44 r2 = r0.a(r2, r3, r4, r5)
            android.view.MenuItem r1 = r1.h(r2)
            return r1
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(java.lang.CharSequence r3) {
            r2 = this;
            i44 r0 = r2.c
            r1 = 0
            o44 r3 = r0.a(r1, r1, r1, r3)
            android.view.MenuItem r2 = r2.h(r3)
            return r2
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int r12, int r13, int r14, android.content.ComponentName r15, android.content.Intent[] r16, android.content.Intent r17, int r18, android.view.MenuItem[] r19) {
            r11 = this;
            r0 = r19
            if (r0 == 0) goto L9
            int r1 = r0.length
            android.view.MenuItem[] r1 = new android.view.MenuItem[r1]
        L7:
            r10 = r1
            goto Lb
        L9:
            r1 = 0
            goto L7
        Lb:
            i44 r2 = r11.c
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            int r12 = r2.addIntentOptions(r3, r4, r5, r6, r7, r8, r9, r10)
            if (r10 == 0) goto L2c
            int r13 = r10.length
            r14 = 0
        L1f:
            if (r14 >= r13) goto L2c
            r15 = r10[r14]
            android.view.MenuItem r15 = r11.h(r15)
            r0[r14] = r15
            int r14 = r14 + 1
            goto L1f
        L2c:
            return r12
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int r1) {
            r0 = this;
            i44 r0 = r0.c
            android.view.SubMenu r0 = r0.addSubMenu(r1)
            return r0
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int r1, int r2, int r3, int r4) {
            r0 = this;
            i44 r0 = r0.c
            android.view.SubMenu r0 = r0.addSubMenu(r1, r2, r3, r4)
            return r0
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            i44 r0 = r0.c
            android.view.SubMenu r0 = r0.addSubMenu(r1, r2, r3, r4)
            return r0
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(java.lang.CharSequence r2) {
            r1 = this;
            i44 r1 = r1.c
            r0 = 0
            android.view.SubMenu r1 = r1.addSubMenu(r0, r0, r0, r2)
            return r1
    }

    @Override // android.view.Menu
    public final void clear() {
            r1 = this;
            java.lang.Object r0 = r1.b
            ci6 r0 = (defpackage.ci6) r0
            if (r0 == 0) goto L9
            r0.clear()
        L9:
            i44 r1 = r1.c
            r1.clear()
            return
    }

    @Override // android.view.Menu
    public final void close() {
            r0 = this;
            i44 r0 = r0.c
            r0.close()
            return
    }

    @Override // android.view.Menu
    public final android.view.MenuItem findItem(int r2) {
            r1 = this;
            i44 r0 = r1.c
            android.view.MenuItem r2 = r0.findItem(r2)
            android.view.MenuItem r1 = r1.h(r2)
            return r1
    }

    @Override // android.view.Menu
    public final android.view.MenuItem getItem(int r2) {
            r1 = this;
            i44 r0 = r1.c
            android.view.MenuItem r2 = r0.getItem(r2)
            android.view.MenuItem r1 = r1.h(r2)
            return r1
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
            r0 = this;
            i44 r0 = r0.c
            boolean r0 = r0.hasVisibleItems()
            return r0
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int r1, android.view.KeyEvent r2) {
            r0 = this;
            i44 r0 = r0.c
            boolean r0 = r0.isShortcutKey(r1, r2)
            return r0
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int r1, int r2) {
            r0 = this;
            i44 r0 = r0.c
            boolean r0 = r0.performIdentifierAction(r1, r2)
            return r0
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int r1, android.view.KeyEvent r2, int r3) {
            r0 = this;
            i44 r0 = r0.c
            boolean r0 = r0.performShortcut(r1, r2, r3)
            return r0
    }

    @Override // android.view.Menu
    public final void removeGroup(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.b
            ci6 r0 = (defpackage.ci6) r0
            if (r0 != 0) goto L7
            goto L28
        L7:
            r0 = 0
        L8:
            java.lang.Object r1 = r3.b
            ci6 r1 = (defpackage.ci6) r1
            int r2 = r1.L
            if (r0 >= r2) goto L28
            java.lang.Object r1 = r1.f(r0)
            lu6 r1 = (defpackage.lu6) r1
            int r1 = r1.getGroupId()
            if (r1 != r4) goto L25
            java.lang.Object r1 = r3.b
            ci6 r1 = (defpackage.ci6) r1
            r1.g(r0)
            int r0 = r0 + (-1)
        L25:
            int r0 = r0 + 1
            goto L8
        L28:
            i44 r3 = r3.c
            r3.removeGroup(r4)
            return
    }

    @Override // android.view.Menu
    public final void removeItem(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.b
            ci6 r0 = (defpackage.ci6) r0
            if (r0 != 0) goto L7
            goto L27
        L7:
            r0 = 0
        L8:
            java.lang.Object r1 = r3.b
            ci6 r1 = (defpackage.ci6) r1
            int r2 = r1.L
            if (r0 >= r2) goto L27
            java.lang.Object r1 = r1.f(r0)
            lu6 r1 = (defpackage.lu6) r1
            int r1 = r1.getItemId()
            if (r1 != r4) goto L24
            java.lang.Object r1 = r3.b
            ci6 r1 = (defpackage.ci6) r1
            r1.g(r0)
            goto L27
        L24:
            int r0 = r0 + 1
            goto L8
        L27:
            i44 r3 = r3.c
            r3.removeItem(r4)
            return
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int r1, boolean r2, boolean r3) {
            r0 = this;
            i44 r0 = r0.c
            r0.setGroupCheckable(r1, r2, r3)
            return
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int r1, boolean r2) {
            r0 = this;
            i44 r0 = r0.c
            r0.setGroupEnabled(r1, r2)
            return
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int r1, boolean r2) {
            r0 = this;
            i44 r0 = r0.c
            r0.setGroupVisible(r1, r2)
            return
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean r1) {
            r0 = this;
            i44 r0 = r0.c
            r0.setQwertyMode(r1)
            return
    }

    @Override // android.view.Menu
    public final int size() {
            r0 = this;
            i44 r0 = r0.c
            int r0 = r0.size()
            return r0
    }
}
