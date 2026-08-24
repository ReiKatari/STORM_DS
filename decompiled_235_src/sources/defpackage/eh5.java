package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eh5  reason: default package */
/* loaded from: classes.dex */
public final class eh5 extends ct0 {
    public final ar0 b;
    public final nu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh5(ar0 ar0Var, gg3 gg3Var) {
        super(gg3Var);
        gg3Var.getClass();
        this.b = ar0Var;
        wb6 e = gg3Var.e();
        e.getClass();
        this.c = new nu(e, 0);
    }

    @Override // defpackage.gg3
    public final wb6 e() {
        return this.c;
    }

    @Override // defpackage.m0
    public final Object f() {
        return new ArrayList();
    }

    @Override // defpackage.m0
    public final int g(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.m0
    public final Iterator h(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new w0(objArr);
    }

    @Override // defpackage.m0
    public final int i(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // defpackage.m0
    public final Object l(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return new ArrayList(asList);
    }

    @Override // defpackage.m0
    public final Object m(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        Class cls = this.b.a;
        cls.getClass();
        Object newInstance = Array.newInstance(cls, arrayList.size());
        newInstance.getClass();
        Object[] array = arrayList.toArray((Object[]) newInstance);
        array.getClass();
        return array;
    }

    @Override // defpackage.ct0
    public final void n(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
