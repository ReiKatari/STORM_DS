package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ai3  reason: default package */
/* loaded from: classes.dex */
public final class ai3 {
    public final int a;
    public final zh3[] b;
    public final ci3 c;
    public final List d;
    public final int e;
    public final int f;
    public final int g;

    public ai3(int i, zh3[] zh3VarArr, ci3 ci3Var, List list, int i2) {
        this.a = i;
        this.b = zh3VarArr;
        this.c = ci3Var;
        this.d = list;
        this.e = i2;
        int i3 = 0;
        for (zh3 zh3Var : zh3VarArr) {
            i3 = Math.max(i3, zh3Var.k);
        }
        this.f = i3;
        int i4 = i3 + this.e;
        this.g = i4 >= 0 ? i4 : 0;
    }

    public final zh3[] a(int i, int i2, int i3) {
        zh3[] zh3VarArr = this.b;
        int length = zh3VarArr.length;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            zh3 zh3Var = zh3VarArr[i4];
            int i7 = i5 + 1;
            int i8 = (int) ((fo2) this.d.get(i5)).a;
            zh3Var.k(i, ((int[]) this.c.L)[i6], i2, i3, this.a, i6);
            i6 += i8;
            i4++;
            i5 = i7;
        }
        return zh3VarArr;
    }
}
