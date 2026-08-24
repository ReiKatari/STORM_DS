package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z47  reason: default package */
/* loaded from: classes.dex */
public final class z47 implements android.view.ActionMode.Callback {
    public final android.view.ActionMode.Callback a;
    public final android.widget.TextView b;
    public java.lang.Class c;
    public java.lang.reflect.Method d;
    public boolean e;
    public boolean f;

    public z47(android.view.ActionMode.Callback r1, android.widget.TextView r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r1 = 0
            r0.f = r1
            return
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(android.view.ActionMode r1, android.view.MenuItem r2) {
            r0 = this;
            android.view.ActionMode$Callback r0 = r0.a
            boolean r0 = r0.onActionItemClicked(r1, r2)
            return r0
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(android.view.ActionMode r1, android.view.Menu r2) {
            r0 = this;
            android.view.ActionMode$Callback r0 = r0.a
            boolean r0 = r0.onCreateActionMode(r1, r2)
            return r0
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(android.view.ActionMode r1) {
            r0 = this;
            android.view.ActionMode$Callback r0 = r0.a
            r0.onDestroyActionMode(r1)
            return
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(android.view.ActionMode r14, android.view.Menu r15) {
            r13 = this;
            android.widget.TextView r0 = r13.b
            android.content.Context r1 = r0.getContext()
            android.content.pm.PackageManager r2 = r1.getPackageManager()
            boolean r3 = r13.f
            java.lang.Class r4 = java.lang.Integer.TYPE
            java.lang.String r5 = "removeItemAt"
            r6 = 0
            r7 = 1
            if (r3 != 0) goto L32
            r13.f = r7
            java.lang.String r3 = "com.android.internal.view.menu.MenuBuilder"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L2b
            r13.c = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Class[] r8 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L2b
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r8)     // Catch: java.lang.Throwable -> L2b
            r13.d = r3     // Catch: java.lang.Throwable -> L2b
            r13.e = r7     // Catch: java.lang.Throwable -> L2b
            goto L32
        L2b:
            r3 = 0
            r13.c = r3
            r13.d = r3
            r13.e = r6
        L32:
            boolean r3 = r13.e     // Catch: java.lang.Throwable -> L11f
            if (r3 == 0) goto L41
            java.lang.Class r3 = r13.c     // Catch: java.lang.Throwable -> L11f
            boolean r3 = r3.isInstance(r15)     // Catch: java.lang.Throwable -> L11f
            if (r3 == 0) goto L41
            java.lang.reflect.Method r3 = r13.d     // Catch: java.lang.Throwable -> L11f
            goto L4d
        L41:
            java.lang.Class r3 = r15.getClass()     // Catch: java.lang.Throwable -> L11f
            java.lang.Class[] r4 = new java.lang.Class[]{r4}     // Catch: java.lang.Throwable -> L11f
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r5, r4)     // Catch: java.lang.Throwable -> L11f
        L4d:
            int r4 = r15.size()     // Catch: java.lang.Throwable -> L11f
            int r4 = r4 - r7
        L52:
            java.lang.String r5 = "android.intent.action.PROCESS_TEXT"
            if (r4 < 0) goto L7c
            android.view.MenuItem r8 = r15.getItem(r4)     // Catch: java.lang.Throwable -> L11f
            android.content.Intent r9 = r8.getIntent()     // Catch: java.lang.Throwable -> L11f
            if (r9 == 0) goto L79
            android.content.Intent r8 = r8.getIntent()     // Catch: java.lang.Throwable -> L11f
            java.lang.String r8 = r8.getAction()     // Catch: java.lang.Throwable -> L11f
            boolean r5 = r5.equals(r8)     // Catch: java.lang.Throwable -> L11f
            if (r5 == 0) goto L79
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L11f
            java.lang.Object[] r5 = new java.lang.Object[]{r5}     // Catch: java.lang.Throwable -> L11f
            r3.invoke(r15, r5)     // Catch: java.lang.Throwable -> L11f
        L79:
            int r4 = r4 + (-1)
            goto L52
        L7c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            boolean r4 = r1 instanceof android.app.Activity
            java.lang.String r8 = "text/plain"
            if (r4 != 0) goto L88
            goto Lcd
        L88:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            android.content.Intent r4 = r4.setAction(r5)
            android.content.Intent r4 = r4.setType(r8)
            java.util.List r4 = r2.queryIntentActivities(r4, r6)
            java.util.Iterator r4 = r4.iterator()
        L9d:
            boolean r9 = r4.hasNext()
            if (r9 == 0) goto Lcd
            java.lang.Object r9 = r4.next()
            android.content.pm.ResolveInfo r9 = (android.content.pm.ResolveInfo) r9
            java.lang.String r10 = r1.getPackageName()
            android.content.pm.ActivityInfo r11 = r9.activityInfo
            java.lang.String r11 = r11.packageName
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto Lb8
            goto Lc9
        Lb8:
            android.content.pm.ActivityInfo r10 = r9.activityInfo
            boolean r11 = r10.exported
            if (r11 != 0) goto Lbf
            goto L9d
        Lbf:
            java.lang.String r10 = r10.permission
            if (r10 == 0) goto Lc9
            int r10 = r1.checkSelfPermission(r10)
            if (r10 != 0) goto L9d
        Lc9:
            r3.add(r9)
            goto L9d
        Lcd:
            r1 = r6
        Lce:
            int r4 = r3.size()
            if (r1 >= r4) goto L11f
            java.lang.Object r4 = r3.get(r1)
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            int r9 = r1 + 100
            java.lang.CharSequence r10 = r4.loadLabel(r2)
            android.view.MenuItem r9 = r15.add(r6, r6, r9, r10)
            android.content.Intent r10 = new android.content.Intent
            r10.<init>()
            android.content.Intent r10 = r10.setAction(r5)
            android.content.Intent r10 = r10.setType(r8)
            boolean r11 = r0 instanceof android.text.Editable
            if (r11 == 0) goto L103
            boolean r11 = r0.onCheckIsTextEditor()
            if (r11 == 0) goto L103
            boolean r11 = r0.isEnabled()
            if (r11 == 0) goto L103
            r11 = r7
            goto L104
        L103:
            r11 = r6
        L104:
            r11 = r11 ^ r7
            java.lang.String r12 = "android.intent.extra.PROCESS_TEXT_READONLY"
            android.content.Intent r10 = r10.putExtra(r12, r11)
            android.content.pm.ActivityInfo r4 = r4.activityInfo
            java.lang.String r11 = r4.packageName
            java.lang.String r4 = r4.name
            android.content.Intent r4 = r10.setClassName(r11, r4)
            android.view.MenuItem r4 = r9.setIntent(r4)
            r4.setShowAsAction(r7)
            int r1 = r1 + 1
            goto Lce
        L11f:
            android.view.ActionMode$Callback r13 = r13.a
            boolean r13 = r13.onPrepareActionMode(r14, r15)
            return r13
    }
}
