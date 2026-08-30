package defpackage;

import java.util.ArrayList;
import java.util.Collection;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vd0  reason: default package */
/* loaded from: classes.dex */
public interface vd0 extends hb0, e47 {
    fq3 a();

    @Override // defpackage.hb0
    default qd0 b() {
        return l();
    }

    default boolean e() {
        return false;
    }

    void f(Collection collection);

    default boolean g() {
        if (b().c() == 0) {
            return true;
        }
        return false;
    }

    void h(ArrayList arrayList);

    default boolean j() {
        return true;
    }

    td0 l();

    mc0 n();

    default fc0 p() {
        return ic0.a;
    }

    default void i() {
    }

    default void c(boolean z) {
    }

    default void k(boolean z) {
    }

    default void r(fc0 fc0Var) {
    }
}
