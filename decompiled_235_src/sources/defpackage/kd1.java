package defpackage;

import java.util.Date;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kd1  reason: default package */
/* loaded from: classes.dex */
public class kd1 implements zc7 {
    @Override // defpackage.zc7
    public final yc7 a(su2 su2Var, ie7 ie7Var) {
        if (ie7Var.a == Date.class) {
            return new nd1(md1.b, 2, 2);
        }
        return null;
    }

    public final String toString() {
        return "DefaultDateTypeAdapter#DEFAULT_STYLE_FACTORY";
    }
}
