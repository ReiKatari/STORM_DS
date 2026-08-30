package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o75  reason: default package */
/* loaded from: classes.dex */
public final class o75 extends pq0 {
    public final qo0 b;
    public final vt c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o75(qo0 qo0Var, m93 m93Var) {
        super(m93Var);
        m93Var.getClass();
        this.b = qo0Var;
        h06 e = m93Var.e();
        e.getClass();
        this.c = new vt(e, 0);
    }

    @Override // defpackage.m93
    public final h06 e() {
        return this.c;
    }

    @Override // defpackage.l0
    public final Object f() {
        return new ArrayList();
    }

    @Override // defpackage.l0
    public final int g(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        return arrayList.size();
    }

    @Override // defpackage.l0
    public final Iterator h(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return new v0(objArr);
    }

    @Override // defpackage.l0
    public final int i(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        return objArr.length;
    }

    @Override // defpackage.l0
    public final Object l(Object obj) {
        Object[] objArr = (Object[]) obj;
        objArr.getClass();
        List asList = Arrays.asList(objArr);
        asList.getClass();
        return new ArrayList(asList);
    }

    @Override // defpackage.l0
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

    @Override // defpackage.pq0
    public final void n(int i, Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) obj;
        arrayList.getClass();
        arrayList.add(i, obj2);
    }
}
