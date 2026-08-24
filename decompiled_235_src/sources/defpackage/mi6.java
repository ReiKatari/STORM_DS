package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mi6  reason: default package */
/* loaded from: classes.dex */
public final class mi6 {
    public final vs4 a = np2.Y(Boolean.FALSE);
    public final vs4 b = np2.Y(null);

    public final void a(String str, List list, qn2 qn2Var, Object obj, qn2 qn2Var2) {
        list.getClass();
        vs4 vs4Var = this.a;
        if (((Boolean) vs4Var.getValue()).booleanValue()) {
            return;
        }
        this.b.setValue(new li6(str, list, qn2Var, obj, qn2Var2));
        vs4Var.setValue(Boolean.TRUE);
    }
}
