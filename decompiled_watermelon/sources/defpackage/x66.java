package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x66  reason: default package */
/* loaded from: classes.dex */
public final class x66 {
    public final tj4 a = me2.G(Boolean.FALSE);
    public final tj4 b = me2.G(null);

    public final void a(String str, List list, mi2 mi2Var, Object obj, mi2 mi2Var2) {
        list.getClass();
        tj4 tj4Var = this.a;
        if (((Boolean) tj4Var.getValue()).booleanValue()) {
            return;
        }
        this.b.setValue(new w66(str, list, mi2Var, obj, mi2Var2));
        tj4Var.setValue(Boolean.TRUE);
    }
}
