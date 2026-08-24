package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ot2  reason: default package */
/* loaded from: classes.dex */
public final class ot2 {
    public final xw a = g04.u(new np6(null, null, null, null, null, null, null, null, null, null));

    /* JADX WARN: Code restructure failed: missing block: B:72:0x009a, code lost:
        if (r0 == null) goto L81;
     */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ed A[LOOP:0: B:44:0x0057->B:97:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(ot2 ot2Var, oa oaVar, qb qbVar, xz xzVar, pd2 pd2Var, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i) {
        oa oaVar2;
        qb qbVar2;
        xz xzVar2;
        pd2 pd2Var2;
        List list4;
        List list5;
        List list6;
        Boolean bool4;
        Boolean bool5;
        Boolean bool6;
        oa oaVar3;
        qb qbVar3;
        xz xzVar3;
        pd2 pd2Var3;
        pd2 pd2Var4;
        List list7;
        List list8;
        List list9;
        List list10;
        Boolean bool7;
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        Boolean bool11;
        if ((i & 1) != 0) {
            oaVar2 = null;
        } else {
            oaVar2 = oaVar;
        }
        if ((i & 2) != 0) {
            qbVar2 = null;
        } else {
            qbVar2 = qbVar;
        }
        if ((i & 4) != 0) {
            xzVar2 = null;
        } else {
            xzVar2 = xzVar;
        }
        if ((i & 8) != 0) {
            pd2Var2 = null;
        } else {
            pd2Var2 = pd2Var;
        }
        if ((i & 16) != 0) {
            list4 = null;
        } else {
            list4 = list;
        }
        if ((i & 32) != 0) {
            list5 = null;
        } else {
            list5 = list2;
        }
        if ((i & 64) != 0) {
            list6 = null;
        } else {
            list6 = list3;
        }
        if ((i & 128) != 0) {
            bool4 = null;
        } else {
            bool4 = bool;
        }
        if ((i & 256) != 0) {
            bool5 = null;
        } else {
            bool5 = bool2;
        }
        if ((i & 512) != 0) {
            bool6 = null;
        } else {
            bool6 = bool3;
        }
        xw xwVar = ot2Var.a;
        while (true) {
            Object obj = xwVar.a;
            np6 np6Var = (np6) obj;
            if (oaVar2 == null) {
                oaVar3 = np6Var.a;
            } else {
                oaVar3 = oaVar2;
            }
            if (qbVar2 == null) {
                qbVar3 = np6Var.b;
            } else {
                qbVar3 = qbVar2;
            }
            if (xzVar2 == null) {
                xzVar3 = np6Var.c;
            } else {
                xzVar3 = xzVar2;
            }
            Boolean bool12 = bool6;
            if (pd2Var2 == null) {
                pd2Var3 = np6Var.d;
            } else {
                pd2Var3 = pd2Var2;
            }
            if (list4 != null) {
                if (list4.isEmpty()) {
                    list7 = null;
                } else {
                    list7 = list4;
                }
                if (list7 != null) {
                    pd2Var4 = pd2Var3;
                    if (list5 != null) {
                        if (list5.isEmpty()) {
                            list8 = null;
                        } else {
                            list8 = list5;
                        }
                    }
                    list8 = np6Var.f;
                    if (list6 != null) {
                        if (list6.isEmpty()) {
                            list10 = null;
                        } else {
                            list10 = list6;
                        }
                        if (list10 != null) {
                            list9 = list8;
                            if (bool4 == null) {
                                bool7 = np6Var.h;
                            } else {
                                bool7 = bool4;
                            }
                            bool8 = bool7;
                            if (bool5 == null) {
                                bool9 = np6Var.i;
                            } else {
                                bool9 = bool5;
                            }
                            bool10 = bool9;
                            if (bool12 == null) {
                                bool11 = np6Var.j;
                            } else {
                                bool11 = bool12;
                            }
                            np6Var.getClass();
                            if (xwVar.a(obj, new np6(oaVar3, qbVar3, xzVar3, pd2Var4, list7, list9, list10, bool8, bool10, bool11))) {
                                return;
                            }
                            bool6 = bool12;
                        }
                    }
                    list9 = list8;
                    list10 = np6Var.g;
                    if (bool4 == null) {
                    }
                    bool8 = bool7;
                    if (bool5 == null) {
                    }
                    bool10 = bool9;
                    if (bool12 == null) {
                    }
                    np6Var.getClass();
                    if (xwVar.a(obj, new np6(oaVar3, qbVar3, xzVar3, pd2Var4, list7, list9, list10, bool8, bool10, bool11))) {
                    }
                }
            }
            pd2Var4 = pd2Var3;
            list7 = np6Var.e;
            if (list5 != null) {
            }
            list8 = np6Var.f;
            if (list6 != null) {
            }
            list9 = list8;
            list10 = np6Var.g;
            if (bool4 == null) {
            }
            bool8 = bool7;
            if (bool5 == null) {
            }
            bool10 = bool9;
            if (bool12 == null) {
            }
            np6Var.getClass();
            if (xwVar.a(obj, new np6(oaVar3, qbVar3, xzVar3, pd2Var4, list7, list9, list10, bool8, bool10, bool11))) {
            }
        }
    }

    public final LinkedHashMap a() {
        np6 np6Var = (np6) this.a.a;
        np6Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        oa oaVar = np6Var.a;
        if (oaVar != null) {
            int i = oaVar.a;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
            key.getClass();
            linkedHashMap.put(key, Integer.valueOf(i));
        }
        qb qbVar = np6Var.b;
        if (qbVar != null) {
            int i2 = qbVar.a;
            CaptureRequest.Key key2 = CaptureRequest.CONTROL_AF_MODE;
            key2.getClass();
            linkedHashMap.put(key2, Integer.valueOf(i2));
        }
        xz xzVar = np6Var.c;
        if (xzVar != null) {
            int i3 = xzVar.a;
            CaptureRequest.Key key3 = CaptureRequest.CONTROL_AWB_MODE;
            key3.getClass();
            linkedHashMap.put(key3, Integer.valueOf(i3));
        }
        pd2 pd2Var = np6Var.d;
        if (pd2Var != null) {
            int i4 = pd2Var.a;
            CaptureRequest.Key key4 = CaptureRequest.FLASH_MODE;
            key4.getClass();
            linkedHashMap.put(key4, Integer.valueOf(i4));
        }
        List list = np6Var.e;
        if (list != null) {
            CaptureRequest.Key key5 = CaptureRequest.CONTROL_AE_REGIONS;
            key5.getClass();
            linkedHashMap.put(key5, list.toArray(new MeteringRectangle[0]));
        }
        List list2 = np6Var.f;
        if (list2 != null) {
            CaptureRequest.Key key6 = CaptureRequest.CONTROL_AF_REGIONS;
            key6.getClass();
            linkedHashMap.put(key6, list2.toArray(new MeteringRectangle[0]));
        }
        List list3 = np6Var.g;
        if (list3 != null) {
            CaptureRequest.Key key7 = CaptureRequest.CONTROL_AWB_REGIONS;
            key7.getClass();
            linkedHashMap.put(key7, list3.toArray(new MeteringRectangle[0]));
        }
        Boolean bool = np6Var.h;
        if (bool != null) {
            CaptureRequest.Key key8 = CaptureRequest.CONTROL_AE_LOCK;
            key8.getClass();
            linkedHashMap.put(key8, bool);
        }
        Boolean bool2 = np6Var.j;
        if (bool2 != null) {
            CaptureRequest.Key key9 = CaptureRequest.CONTROL_AWB_LOCK;
            key9.getClass();
            linkedHashMap.put(key9, bool2);
        }
        return linkedHashMap;
    }
}
