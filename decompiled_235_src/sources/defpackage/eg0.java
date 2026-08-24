package defpackage;

import java.util.ArrayList;
import java.util.Collection;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eg0  reason: default package */
/* loaded from: classes.dex */
public interface eg0 extends pd0, ci7 {
    @Override // defpackage.pd0
    default zf0 a() {
        return q();
    }

    default boolean c() {
        if (a().m() == 0) {
            return true;
        }
        return false;
    }

    ve0 e();

    default oe0 f() {
        return re0.a;
    }

    default boolean k() {
        return false;
    }

    void l(Collection collection);

    void m(ArrayList arrayList);

    default boolean o() {
        return true;
    }

    cg0 q();

    gx3 release();

    default void n() {
    }

    default void i(oe0 oe0Var) {
    }

    default void j(boolean z) {
    }

    default void p(boolean z) {
    }
}
