package defpackage;

import android.net.Uri;
import android.provider.DocumentsContract;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: go5  reason: default package */
/* loaded from: classes.dex */
public final class go5 implements w92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ yo5 B;

    public go5(yo5 yo5Var, o31 o31Var) {
        this.A = 0;
        this.B = yo5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.util.List r7, defpackage.j11 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ho5
            if (r0 == 0) goto L13
            r0 = r8
            ho5 r0 = (defpackage.ho5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ho5 r0 = new ho5
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            yo5 r6 = r6.B
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            defpackage.me2.a0(r8)
            goto L45
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L30:
            defpackage.me2.a0(r8)
            bb1 r8 = defpackage.tg1.a
            ug r2 = new ug
            r5 = 11
            r2.<init>(r7, r6, r3, r5)
            r0.Y = r4
            java.lang.Object r8 = defpackage.tq5.G(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            java.util.List r8 = (java.util.List) r8
            ee6 r6 = r6.A
            r6.k(r8)
            o27 r6 = defpackage.o27.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go5.a(java.util.List, j11):java.lang.Object");
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        boolean z;
        Object kc5Var;
        int i = this.A;
        o27 o27Var = o27.a;
        yo5 yo5Var = this.B;
        switch (i) {
            case 0:
                Uri[] uriArr = (Uri[]) obj;
                c46 c46Var = yo5Var.t;
                int i2 = 0;
                if (uriArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                c46Var.p(Boolean.valueOf(!z));
                ArrayList arrayList = new ArrayList();
                int length = uriArr.length;
                int i3 = 0;
                while (true) {
                    Object obj2 = null;
                    if (i3 < length) {
                        Uri uri = uriArr[i3];
                        try {
                            String treeDocumentId = DocumentsContract.getTreeDocumentId(uri);
                            treeDocumentId.getClass();
                            String k = yo5.k(treeDocumentId);
                            String decode = Uri.decode(zg6.S0(':', treeDocumentId, treeDocumentId));
                            decode.getClass();
                            kc5Var = new qo5(uri, treeDocumentId, k, decode);
                        } catch (Throwable th) {
                            kc5Var = new kc5(th);
                        }
                        if (!(kc5Var instanceof kc5)) {
                            obj2 = kc5Var;
                        }
                        qo5 qo5Var = (qo5) obj2;
                        if (qo5Var != null) {
                            arrayList.add(qo5Var);
                        }
                        i3++;
                    } else {
                        ee6 ee6Var = yo5Var.C;
                        ee6Var.getClass();
                        ee6Var.l(null, arrayList);
                        ee6 ee6Var2 = yo5Var.D;
                        List list = (List) ee6Var2.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list) {
                            if (obj3 instanceof ko5) {
                                arrayList2.add(obj3);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(uq0.y0(arrayList2, 10));
                        int size = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj4 = arrayList2.get(i4);
                            i4++;
                            arrayList3.add(((ko5) obj4).a);
                        }
                        ArrayList arrayList4 = new ArrayList();
                        int size2 = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size2) {
                            Object obj5 = arrayList3.get(i5);
                            i5++;
                            String str = (String) obj5;
                            if (!arrayList.isEmpty()) {
                                int size3 = arrayList.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 < size3) {
                                        Object obj6 = arrayList.get(i6);
                                        i6++;
                                        if (yo5.o(str, ((qo5) obj6).b)) {
                                            arrayList4.add(obj5);
                                        }
                                    }
                                }
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        boolean isEmpty = arrayList.isEmpty();
                        lo5 lo5Var = lo5.a;
                        if (isEmpty) {
                            arrayList5.add(lo5Var);
                        } else if (arrayList.size() == 1) {
                            if (arrayList4.isEmpty()) {
                                arrayList5.add(new ko5(((qo5) tq0.K0(arrayList)).b));
                            } else {
                                int size4 = arrayList4.size();
                                while (i2 < size4) {
                                    Object obj7 = arrayList4.get(i2);
                                    i2++;
                                    arrayList5.add(new ko5((String) obj7));
                                }
                            }
                        } else {
                            arrayList5.add(lo5Var);
                            int size5 = arrayList4.size();
                            while (i2 < size5) {
                                Object obj8 = arrayList4.get(i2);
                                i2++;
                                arrayList5.add(new ko5((String) obj8));
                            }
                        }
                        if (arrayList5.isEmpty()) {
                            arrayList5.add(lo5Var);
                        }
                        if (!arrayList5.equals(list)) {
                            ee6Var2.l(null, arrayList5);
                        }
                        return o27Var;
                    }
                }
                break;
            case 1:
                return a((List) obj, j11Var);
            case 2:
                yo5Var.E.k((ri5) obj);
                return o27Var;
            default:
                yo5Var.G.k((List) obj);
                return o27Var;
        }
    }

    public /* synthetic */ go5(yo5 yo5Var, int i) {
        this.A = i;
        this.B = yo5Var;
    }
}
