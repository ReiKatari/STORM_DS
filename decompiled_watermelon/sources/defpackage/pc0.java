package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pc0  reason: default package */
/* loaded from: classes.dex */
public interface pc0 {
    static ic1 d(md0 md0Var, ja jaVar, kb kbVar, gy gyVar, List list, List list2, List list3, int i) {
        ja jaVar2;
        kb kbVar2;
        gy gyVar2;
        List list4;
        List list5;
        List list6;
        if ((i & 1) != 0) {
            jaVar2 = null;
        } else {
            jaVar2 = jaVar;
        }
        if ((i & 2) != 0) {
            kbVar2 = null;
        } else {
            kbVar2 = kbVar;
        }
        if ((i & 4) != 0) {
            gyVar2 = null;
        } else {
            gyVar2 = gyVar;
        }
        if ((i & 8) != 0) {
            list4 = null;
        } else {
            list4 = list;
        }
        if ((i & 16) != 0) {
            list5 = null;
        } else {
            list5 = list2;
        }
        if ((i & 32) != 0) {
            list6 = null;
        } else {
            list6 = list3;
        }
        if (!md0Var.A.a()) {
            return l11.a(md0Var.L, jaVar2, kbVar2, gyVar2, null, list4, list5, list6, 8);
        }
        i.m(md0Var, " after close.", "Cannot call update3A on ");
        return null;
    }
}
