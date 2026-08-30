package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xy3  reason: default package */
/* loaded from: classes.dex */
public interface xy3 extends zy3 {
    @Override // defpackage.zy3
    default Object a(aj2 aj2Var, Object obj) {
        return aj2Var.j(obj, this);
    }

    @Override // defpackage.zy3
    default boolean b(mi2 mi2Var) {
        return ((Boolean) mi2Var.n(this)).booleanValue();
    }
}
