package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sw4  reason: default package */
/* loaded from: classes.dex */
public final class sw4 {
    public static final defpackage.ow4 i = null;
    public final java.util.List a;
    public final android.content.Context b;
    public final defpackage.uk1 c;
    public final defpackage.s63 d;
    public final defpackage.pq6 e;
    public final java.util.WeakHashMap f;
    public final java.util.WeakHashMap g;
    public final java.lang.ref.ReferenceQueue h;

    static {
            ow4 r0 = new ow4
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.sw4.i = r0
            return
    }

    public sw4(android.content.Context r4, defpackage.uk1 r5, defpackage.s63 r6, defpackage.pq6 r7) {
            r3 = this;
            r3.<init>()
            r3.b = r4
            r3.c = r5
            r3.d = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r0 = 7
            r6.<init>(r0)
            a41 r0 = new a41
            r1 = 1
            r0.<init>(r4, r1)
            r6.add(r0)
            f31 r0 = new f31
            r0.<init>(r4)
            r6.add(r0)
            m34 r0 = new m34
            r2 = 0
            r0.<init>(r4, r2)
            r6.add(r0)
            a41 r0 = new a41
            r0.<init>(r4, r2)
            r6.add(r0)
            rv r0 = new rv
            r0.<init>(r4)
            r6.add(r0)
            m34 r0 = new m34
            r0.<init>(r4, r1)
            r6.add(r0)
            ff4 r4 = new ff4
            java.lang.Object r5 = r5.e
            ss2 r5 = (defpackage.ss2) r5
            r4.<init>(r5, r7)
            r6.add(r4)
            java.util.List r4 = java.util.Collections.unmodifiableList(r6)
            r3.a = r4
            r3.e = r7
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            r3.f = r4
            java.util.WeakHashMap r4 = new java.util.WeakHashMap
            r4.<init>()
            r3.g = r4
            java.lang.ref.ReferenceQueue r4 = new java.lang.ref.ReferenceQueue
            r4.<init>()
            r3.h = r4
            pw4 r3 = new pw4
            ow4 r5 = defpackage.sw4.i
            r3.<init>(r4, r5)
            r3.start()
            return
    }

    public final void a(java.lang.Object r4) {
            r3 = this;
            java.lang.StringBuilder r0 = defpackage.ck7.a
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L42
            java.util.WeakHashMap r0 = r3.f
            java.lang.Object r0 = r0.remove(r4)
            i33 r0 = (defpackage.i33) r0
            if (r0 == 0) goto L32
            r1 = 1
            r0.g = r1
            yc1 r1 = r0.h
            if (r1 == 0) goto L24
            r1 = 0
            r0.h = r1
        L24:
            uk1 r1 = r3.c
            java.lang.Object r1 = r1.j
            sk1 r1 = (defpackage.sk1) r1
            r2 = 2
            android.os.Message r0 = r1.obtainMessage(r2, r0)
            r1.sendMessage(r0)
        L32:
            boolean r0 = r4 instanceof android.widget.ImageView
            if (r0 == 0) goto L41
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            java.util.WeakHashMap r3 = r3.g
            java.lang.Object r3 = r3.remove(r4)
            defpackage.xg6.A(r3)
        L41:
            return
        L42:
            java.lang.String r3 = "Method call should happen from the main thread."
            defpackage.i.m(r3)
            return
    }

    public final void b(android.graphics.Bitmap r3, defpackage.qw4 r4, defpackage.i33 r5, java.lang.Exception r6) {
            r2 = this;
            boolean r0 = r5.g
            p7 r1 = r5.c
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r5.f
            if (r0 != 0) goto L14
            java.util.WeakHashMap r2 = r2.f
            java.lang.Object r0 = r5.a()
            r2.remove(r0)
        L14:
            if (r3 == 0) goto L4d
            if (r4 == 0) goto L45
            java.lang.Object r2 = r1.get()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 != 0) goto L21
            goto L44
        L21:
            sw4 r6 = r5.a
            android.content.Context r6 = r6.b
            int r0 = defpackage.tw4.e
            android.graphics.drawable.Drawable r0 = r2.getDrawable()
            boolean r1 = r0 instanceof android.graphics.drawable.Animatable
            if (r1 == 0) goto L35
            r1 = r0
            android.graphics.drawable.Animatable r1 = (android.graphics.drawable.Animatable) r1
            r1.stop()
        L35:
            tw4 r1 = new tw4
            r1.<init>(r6, r3, r0, r4)
            r2.setImageDrawable(r1)
            yc1 r2 = r5.h
            if (r2 == 0) goto L44
            r2.I()
        L44:
            return
        L45:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r3 = "LoadedFrom cannot be null."
            r2.<init>(r3)
            throw r2
        L4d:
            java.lang.Object r2 = r1.get()
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 != 0) goto L56
            goto L7f
        L56:
            android.graphics.drawable.Drawable r2 = r2.getDrawable()
            boolean r3 = r2 instanceof android.graphics.drawable.Animatable
            if (r3 == 0) goto L63
            android.graphics.drawable.Animatable r2 = (android.graphics.drawable.Animatable) r2
            r2.stop()
        L63:
            yc1 r2 = r5.h
            if (r2 == 0) goto L7f
            if (r6 == 0) goto L6c
            r6.printStackTrace()
        L6c:
            java.lang.Object r2 = r2.A
            me.magnum.melonds.ui.layouteditor.b r2 = (me.magnum.melonds.ui.layouteditor.b) r2
            android.content.Context r2 = r2.getContext()
            r3 = 2131952127(0x7f1301ff, float:1.9540688E38)
            r4 = 1
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r3, r4)
            r2.show()
        L7f:
            return
    }

    public final void c(defpackage.i33 r4) {
            r3 = this;
            java.lang.Object r0 = r4.a()
            if (r0 == 0) goto L14
            java.util.WeakHashMap r1 = r3.f
            java.lang.Object r2 = r1.get(r0)
            if (r2 == r4) goto L14
            r3.a(r0)
            r1.put(r0, r4)
        L14:
            uk1 r3 = r3.c
            java.lang.Object r3 = r3.j
            sk1 r3 = (defpackage.sk1) r3
            r0 = 1
            android.os.Message r4 = r3.obtainMessage(r0, r4)
            r3.sendMessage(r4)
            return
    }
}
