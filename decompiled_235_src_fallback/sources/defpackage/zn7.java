package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zn7  reason: default package */
/* loaded from: classes.dex */
public final class zn7 {
    public static final java.util.ArrayList d = null;
    public java.util.WeakHashMap a;
    public android.util.SparseArray b;
    public java.lang.ref.WeakReference c;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            defpackage.zn7.d = r0
            return
    }

    public final android.view.View a(android.view.View r5) {
            r4 = this;
            java.util.WeakHashMap r0 = r4.a
            r1 = 0
            if (r0 == 0) goto L47
            boolean r0 = r0.containsKey(r5)
            if (r0 != 0) goto Lc
            goto L47
        Lc:
            boolean r0 = r5 instanceof android.view.ViewGroup
            if (r0 == 0) goto L29
            r0 = r5
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            int r2 = r2 + (-1)
        L19:
            if (r2 < 0) goto L29
            android.view.View r3 = r0.getChildAt(r2)
            android.view.View r3 = r4.a(r3)
            if (r3 == 0) goto L26
            return r3
        L26:
            int r2 = r2 + (-1)
            goto L19
        L29:
            r4 = 2131427955(0x7f0b0273, float:1.847754E38)
            java.lang.Object r4 = r5.getTag(r4)
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            if (r4 == 0) goto L47
            int r5 = r4.size()
            int r5 = r5 + (-1)
            if (r5 >= 0) goto L3d
            goto L47
        L3d:
            java.lang.Object r4 = r4.get(r5)
            r4.getClass()
            defpackage.u34.a()
        L47:
            return r1
    }
}
