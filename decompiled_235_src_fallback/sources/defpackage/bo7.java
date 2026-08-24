package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bo7  reason: default package */
/* loaded from: classes.dex */
public final class bo7 extends android.content.ContextWrapper {
    public android.view.LayoutInflater a;
    public android.view.LayoutInflater b;

    public bo7(android.content.Context r2, androidx.fragment.app.o r3) {
            r1 = this;
            r2.getClass()
            r1.<init>(r2)
            mf5 r2 = new mf5
            r0 = 5
            r2.<init>(r1, r0)
            r0 = 0
            r1.a = r0
            r3.getClass()
            ut3 r1 = r3.getLifecycle()
            r1.a(r2)
            return
    }

    public bo7(android.view.LayoutInflater r3, androidx.fragment.app.o r4) {
            r2 = this;
            r3.getClass()
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            r2.<init>(r0)
            mf5 r0 = new mf5
            r1 = 5
            r0.<init>(r2, r1)
            r2.a = r3
            r4.getClass()
            ut3 r2 = r4.getLifecycle()
            r2.a(r0)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "layout_inflater"
            boolean r1 = r0.equals(r3)
            if (r1 != 0) goto L11
            android.content.Context r2 = r2.getBaseContext()
            java.lang.Object r2 = r2.getSystemService(r3)
            return r2
        L11:
            android.view.LayoutInflater r3 = r2.b
            if (r3 != 0) goto L2d
            android.view.LayoutInflater r3 = r2.a
            if (r3 != 0) goto L25
            android.content.Context r3 = r2.getBaseContext()
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.LayoutInflater r3 = (android.view.LayoutInflater) r3
            r2.a = r3
        L25:
            android.view.LayoutInflater r3 = r2.a
            android.view.LayoutInflater r3 = r3.cloneInContext(r2)
            r2.b = r3
        L2d:
            android.view.LayoutInflater r2 = r2.b
            return r2
    }
}
