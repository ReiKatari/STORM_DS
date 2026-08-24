package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wf5  reason: default package */
/* loaded from: classes.dex */
public abstract class wf5 {
    public final defpackage.xf5 a;
    public boolean b;
    public final defpackage.vf5 c;

    public wf5() {
            r1 = this;
            r1.<init>()
            xf5 r0 = new xf5
            r0.<init>()
            r1.a = r0
            r0 = 0
            r1.b = r0
            vf5 r0 = defpackage.vf5.ALLOW
            r1.c = r0
            return
    }

    public abstract int a();

    public long b(int r1) {
            r0 = this;
            r0 = -1
            return r0
    }

    public int c(int r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public void d(androidx.recyclerview.widget.RecyclerView r1) {
            r0 = this;
            return
    }

    public abstract void e(defpackage.wg5 r1, int r2);

    public abstract defpackage.wg5 f(android.view.ViewGroup r1, int r2);

    public final void g(boolean r2) {
            r1 = this;
            xf5 r0 = r1.a
            boolean r0 = r0.a()
            if (r0 != 0) goto Lb
            r1.b = r2
            return
        Lb:
            java.lang.String r1 = "Cannot change whether this adapter has stable IDs while the adapter has registered observers."
            defpackage.i.m(r1)
            return
    }
}
