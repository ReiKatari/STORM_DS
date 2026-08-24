package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ir  reason: default package */
/* loaded from: classes.dex */
public final class ir {
    public static final android.graphics.PorterDuff.Mode b = null;
    public static defpackage.ir c;
    public defpackage.ol5 a;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            defpackage.ir.b = r0
            return
    }

    public static synchronized defpackage.ir a() {
            java.lang.Class<ir> r0 = defpackage.ir.class
            monitor-enter(r0)
            ir r1 = defpackage.ir.c     // Catch: java.lang.Throwable -> Lb
            if (r1 != 0) goto Ld
            d()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r1 = move-exception
            goto L11
        Ld:
            ir r1 = defpackage.ir.c     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return r1
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }

    public static synchronized android.graphics.PorterDuffColorFilter c(int r1, android.graphics.PorterDuff.Mode r2) {
            java.lang.Class<ir> r0 = defpackage.ir.class
            monitor-enter(r0)
            android.graphics.PorterDuffColorFilter r1 = defpackage.ol5.e(r1, r2)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r1
        L9:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    public static synchronized void d() {
            java.lang.Class<ir> r0 = defpackage.ir.class
            monitor-enter(r0)
            ir r1 = defpackage.ir.c     // Catch: java.lang.Throwable -> L26
            if (r1 != 0) goto L28
            ir r1 = new ir     // Catch: java.lang.Throwable -> L26
            r1.<init>()     // Catch: java.lang.Throwable -> L26
            defpackage.ir.c = r1     // Catch: java.lang.Throwable -> L26
            ol5 r2 = defpackage.ol5.b()     // Catch: java.lang.Throwable -> L26
            r1.a = r2     // Catch: java.lang.Throwable -> L26
            ir r1 = defpackage.ir.c     // Catch: java.lang.Throwable -> L26
            ol5 r1 = r1.a     // Catch: java.lang.Throwable -> L26
            pa r2 = new pa     // Catch: java.lang.Throwable -> L26
            r3 = 2
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L26
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L26
            r1.e = r2     // Catch: java.lang.Throwable -> L23
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L26
            goto L28
        L23:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L23
            throw r2     // Catch: java.lang.Throwable -> L26
        L26:
            r1 = move-exception
            goto L2a
        L28:
            monitor-exit(r0)
            return
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L26
            throw r1
    }

    public static void e(android.graphics.drawable.Drawable r4, defpackage.wz0 r5, int[] r6) {
            android.graphics.PorterDuff$Mode r0 = defpackage.ol5.f
            int[] r0 = r4.getState()
            android.graphics.drawable.Drawable r1 = r4.mutate()
            if (r1 != r4) goto L51
            boolean r1 = r4 instanceof android.graphics.drawable.LayerDrawable
            r2 = 0
            if (r1 == 0) goto L1f
            boolean r1 = r4.isStateful()
            if (r1 == 0) goto L1f
            int[] r1 = new int[r2]
            r4.setState(r1)
            r4.setState(r0)
        L1f:
            boolean r0 = r5.b
            if (r0 != 0) goto L2c
            boolean r1 = r5.a
            if (r1 == 0) goto L28
            goto L2c
        L28:
            r4.clearColorFilter()
            return
        L2c:
            r1 = 0
            if (r0 == 0) goto L34
            java.lang.Object r0 = r5.c
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            goto L35
        L34:
            r0 = r1
        L35:
            boolean r3 = r5.a
            if (r3 == 0) goto L3e
            java.io.Serializable r5 = r5.d
            android.graphics.PorterDuff$Mode r5 = (android.graphics.PorterDuff.Mode) r5
            goto L40
        L3e:
            android.graphics.PorterDuff$Mode r5 = defpackage.ol5.f
        L40:
            if (r0 == 0) goto L4d
            if (r5 != 0) goto L45
            goto L4d
        L45:
            int r6 = r0.getColorForState(r6, r2)
            android.graphics.PorterDuffColorFilter r1 = defpackage.ol5.e(r6, r5)
        L4d:
            r4.setColorFilter(r1)
            return
        L51:
            java.lang.String r4 = "ResourceManagerInternal"
            java.lang.String r5 = "Mutated drawable is not the same instance as the input."
            android.util.Log.d(r4, r5)
            return
    }

    public final synchronized android.graphics.drawable.Drawable b(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            ol5 r0 = r1.a     // Catch: java.lang.Throwable -> L9
            android.graphics.drawable.Drawable r2 = r0.c(r2, r3)     // Catch: java.lang.Throwable -> L9
            monitor-exit(r1)
            return r2
        L9:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9
            throw r2
    }
}
