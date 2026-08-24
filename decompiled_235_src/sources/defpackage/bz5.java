package defpackage;

import android.net.Uri;
import android.provider.DocumentsContract;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bz5  reason: default package */
/* loaded from: classes.dex */
public final class bz5 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ tz5 B;

    public bz5(tz5 tz5Var, w61 w61Var) {
        this.A = 0;
        this.B = tz5Var;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        boolean z;
        Object em5Var;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        tz5 tz5Var = this.B;
        switch (i) {
            case 0:
                Uri[] uriArr = (Uri[]) obj;
                of6 of6Var = tz5Var.x;
                int i2 = 0;
                if (uriArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                of6Var.k(Boolean.valueOf(!z));
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
                            String k = tz5.k(treeDocumentId);
                            String decode = Uri.decode(qs6.M0(':', treeDocumentId, treeDocumentId));
                            decode.getClass();
                            em5Var = new lz5(uri, treeDocumentId, k, decode);
                        } catch (Throwable th) {
                            em5Var = new em5(th);
                        }
                        if (!(em5Var instanceof em5)) {
                            obj2 = em5Var;
                        }
                        lz5 lz5Var = (lz5) obj2;
                        if (lz5Var != null) {
                            arrayList.add(lz5Var);
                        }
                        i3++;
                    } else {
                        tp6 tp6Var = tz5Var.F;
                        tp6Var.getClass();
                        tp6Var.m(null, arrayList);
                        tp6 tp6Var2 = tz5Var.G;
                        List list = (List) tp6Var2.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list) {
                            if (obj3 instanceof fz5) {
                                arrayList2.add(obj3);
                            }
                        }
                        ArrayList arrayList3 = new ArrayList(ht0.v0(arrayList2, 10));
                        int size = arrayList2.size();
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj4 = arrayList2.get(i4);
                            i4++;
                            arrayList3.add(((fz5) obj4).a);
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
                                        if (tz5.o(str, ((lz5) obj6).b)) {
                                            arrayList4.add(obj5);
                                        }
                                    }
                                }
                            }
                        }
                        ArrayList arrayList5 = new ArrayList();
                        boolean isEmpty = arrayList.isEmpty();
                        gz5 gz5Var = gz5.a;
                        if (isEmpty) {
                            arrayList5.add(gz5Var);
                        } else if (arrayList.size() == 1) {
                            if (arrayList4.isEmpty()) {
                                arrayList5.add(new fz5(((lz5) gt0.H0(arrayList)).b));
                            } else {
                                int size4 = arrayList4.size();
                                while (i2 < size4) {
                                    Object obj7 = arrayList4.get(i2);
                                    i2++;
                                    arrayList5.add(new fz5((String) obj7));
                                }
                            }
                        } else {
                            arrayList5.add(gz5Var);
                            int size5 = arrayList4.size();
                            while (i2 < size5) {
                                Object obj8 = arrayList4.get(i2);
                                i2++;
                                arrayList5.add(new fz5((String) obj8));
                            }
                        }
                        if (arrayList5.isEmpty()) {
                            arrayList5.add(gz5Var);
                        }
                        if (!arrayList5.equals(list)) {
                            tp6Var2.m(null, arrayList5);
                        }
                        return jg7Var;
                    }
                }
                break;
            case 1:
                return b((List) obj, r41Var);
            case 2:
                tz5Var.H.l((ss5) obj);
                return jg7Var;
            default:
                tz5Var.J.l((List) obj);
                return jg7Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(List list, r41 r41Var) {
        cz5 cz5Var;
        int i;
        if (r41Var instanceof cz5) {
            cz5Var = (cz5) r41Var;
            int i2 = cz5Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cz5Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = cz5Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = cz5Var.Y;
                tz5 tz5Var = this.B;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    xe1 xe1Var = xk1.a;
                    ag agVar = new ag(list, tz5Var, null, 15);
                    cz5Var.Y = 1;
                    obj = hv.d0(xe1Var, agVar, cz5Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                tz5Var.D.l((List) obj);
                return jg7.a;
            }
        }
        cz5Var = new cz5(this, r41Var);
        Object obj2 = cz5Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = cz5Var.Y;
        tz5 tz5Var2 = this.B;
        if (i == 0) {
        }
        tz5Var2.D.l((List) obj2);
        return jg7.a;
    }

    public /* synthetic */ bz5(tz5 tz5Var, int i) {
        this.A = i;
        this.B = tz5Var;
    }
}
