package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yd5  reason: default package */
/* loaded from: classes.dex */
public interface yd5 extends yy0 {
    @Override // defpackage.yy0
    default Object b(xx xxVar, Object obj) {
        return p().b(xxVar, obj);
    }

    @Override // defpackage.yy0
    default Set c() {
        return p().c();
    }

    @Override // defpackage.yy0
    default Object e(xx xxVar) {
        return p().e(xxVar);
    }

    @Override // defpackage.yy0
    default Set f(xx xxVar) {
        return p().f(xxVar);
    }

    @Override // defpackage.yy0
    default Object g(xx xxVar, xy0 xy0Var) {
        return p().g(xxVar, xy0Var);
    }

    @Override // defpackage.yy0
    default void h(pk0 pk0Var) {
        p().h(pk0Var);
    }

    @Override // defpackage.yy0
    default boolean i(xx xxVar) {
        return p().i(xxVar);
    }

    @Override // defpackage.yy0
    default xy0 j(xx xxVar) {
        return p().j(xxVar);
    }

    yy0 p();
}
