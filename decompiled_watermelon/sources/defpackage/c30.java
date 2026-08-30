package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c30  reason: default package */
/* loaded from: classes.dex */
public abstract class c30 extends vy0 {
    @Override // defpackage.vy0
    public final vy0 c() {
        return (c30) ((vy0) this.b);
    }

    @Override // defpackage.vy0
    public final void e(vy0 vy0Var) {
        if (vy0Var instanceof c30) {
            this.b = vy0Var;
        } else {
            i.i("Parent of block must also be block (can not be inline)");
        }
    }
}
