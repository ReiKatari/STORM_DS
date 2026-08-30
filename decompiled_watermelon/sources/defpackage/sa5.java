package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sa5  reason: default package */
/* loaded from: classes.dex */
public final class sa5 {
    public final List a;
    public final Map b;
    public final Map c;
    public final List d;
    public final jb5 e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [qp1] */
    public sa5(List list, LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2, ArrayList arrayList, jb5 jb5Var, int i) {
        int i2 = i & 2;
        ?? r1 = qp1.A;
        linkedHashMap = i2 != 0 ? r1 : linkedHashMap;
        linkedHashMap2 = (i & 4) != 0 ? r1 : linkedHashMap2;
        List list2 = (i & 8) != 0 ? pp1.A : arrayList;
        jb5Var = (i & 16) != 0 ? null : jb5Var;
        linkedHashMap.getClass();
        linkedHashMap2.getClass();
        list2.getClass();
        this.a = list;
        this.b = linkedHashMap;
        this.c = linkedHashMap2;
        this.d = list2;
        this.e = jb5Var;
    }

    public final String toString() {
        jb5 jb5Var;
        String str;
        if (this.e == null) {
            str = "";
        } else {
            str = ", template=" + ((Object) jb5.b(jb5Var.a));
        }
        return "Request(streams=" + this.a + str + ")@" + Integer.toHexString(hashCode());
    }
}
