package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: er5  reason: default package */
/* loaded from: classes.dex */
public final class er5 implements PointerInputEventHandler {
    public final /* synthetic */ qa4 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ on2 d;
    public final /* synthetic */ List e;
    public final /* synthetic */ Map f;
    public final /* synthetic */ qa4 g;
    public final /* synthetic */ qa4 h;
    public final /* synthetic */ qa4 i;
    public final /* synthetic */ eo2 j;

    public er5(qa4 qa4Var, int i, boolean z, on2 on2Var, List list, Map map, qa4 qa4Var2, qa4 qa4Var3, qa4 qa4Var4, eo2 eo2Var) {
        this.a = qa4Var;
        this.b = i;
        this.c = z;
        this.d = on2Var;
        this.e = list;
        this.f = map;
        this.g = qa4Var2;
        this.h = qa4Var3;
        this.i = qa4Var4;
        this.j = eo2Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(zy4 zy4Var, r41 r41Var) {
        qa4 qa4Var = this.a;
        int i = this.b;
        boolean z = this.c;
        on2 on2Var = this.d;
        List list = this.e;
        Map map = this.f;
        qa4 qa4Var2 = this.g;
        qa4 qa4Var3 = this.h;
        qa4 qa4Var4 = this.i;
        eo2 eo2Var = this.j;
        br5 br5Var = new br5(qa4Var, i, z, on2Var, list, map, qa4Var2, qa4Var3, qa4Var4, eo2Var);
        cr5 cr5Var = new cr5(qa4Var, qa4Var4, qa4Var3, 0);
        cr5 cr5Var2 = new cr5(qa4Var, qa4Var4, qa4Var3, 1);
        dr5 dr5Var = new dr5(i, z, on2Var, list, map, qa4Var2, qa4Var3, qa4Var4, eo2Var);
        float f = sn1.a;
        Object o = uj2.o(zy4Var, new on1(br5Var, dr5Var, cr5Var, cr5Var2, (r41) null, 1), r41Var);
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        jg7 jg7Var = jg7.a;
        if (o != x61Var) {
            o = jg7Var;
        }
        if (o == x61Var) {
            return o;
        }
        return jg7Var;
    }
}
