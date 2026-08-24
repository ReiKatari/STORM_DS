package defpackage;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a7  reason: default package */
/* loaded from: classes.dex */
public final class a7 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ne2 B;

    public /* synthetic */ a7(ne2 ne2Var, int i) {
        this.A = i;
        this.B = ne2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(r41 r41Var, Object obj) {
        c16 c16Var;
        int i;
        if (r41Var instanceof c16) {
            c16Var = (c16) r41Var;
            int i2 = c16Var.X;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c16Var.X = i2 - Integer.MIN_VALUE;
                Object obj2 = c16Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = c16Var.X;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj2);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj2);
                    List<zm0> list = (List) obj;
                    ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
                    for (zm0 zm0Var : list) {
                        arrayList.add(new Cheat(zm0Var.a, zm0Var.c, zm0Var.d, zm0Var.e, zm0Var.f, zm0Var.g));
                    }
                    c16Var.X = 1;
                    if (this.B.a(arrayList, c16Var) == x61Var) {
                        return x61Var;
                    }
                }
                return jg7.a;
            }
        }
        c16Var = new c16(this, r41Var);
        Object obj22 = c16Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = c16Var.X;
        if (i == 0) {
        }
        return jg7.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0462  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x04af  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x04ba  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04fd  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0540  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x054a  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0583  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0602  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:345:0x0645  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x06d4  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:401:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:432:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0826  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0864  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x086e  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x08b3  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x08ee  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x08f8  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x09e5  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x0a35  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x0a40  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0a9f  */
    /* JADX WARN: Removed duplicated region for block: B:626:0x0aaa  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:697:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARN: Type inference failed for: r23v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r23v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r23v9, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v109, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v82, types: [java.lang.String, ky] */
    @Override // defpackage.ne2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, r41 r41Var) {
        z6 z6Var;
        int i;
        c7 c7Var;
        int i2;
        Object obj2;
        gl glVar;
        int i3;
        an anVar;
        int i4;
        kw kwVar;
        int i5;
        wi6 wi6Var;
        ge7 ge7Var;
        up0 up0Var;
        int i6;
        xp0 xp0Var;
        int i7;
        cp2 cp2Var;
        zp0 zp0Var;
        int i8;
        an0 an0Var;
        f21 f21Var;
        int i9;
        t21 t21Var;
        int i10;
        int i11;
        int i12;
        ge7 ge7Var2;
        wi6 wi6Var2;
        wa1 wa1Var;
        int i13;
        yv1 yv1Var;
        int i14;
        ox1 ox1Var;
        int i15;
        px1 px1Var;
        int i16;
        v02 v02Var;
        int i17;
        w02 w02Var;
        int i18;
        vf2 vf2Var;
        int i19;
        ga3 ga3Var;
        int i20;
        qa3 qa3Var;
        int i21;
        vl3 vl3Var;
        int i22;
        xl3 xl3Var;
        int i23;
        ax4 ax4Var;
        int i24;
        yf0 yf0Var;
        co5 co5Var;
        int i25;
        do5 do5Var;
        int i26;
        int i27;
        ls5 ls5Var;
        int i28;
        sz5 sz5Var;
        int i29;
        z06 z06Var;
        int i30;
        jg7 jg7Var;
        b16 b16Var;
        int i31;
        zn0 zn0Var;
        zw7 zw7Var;
        int i32;
        int i33 = this.A;
        int i34 = 0;
        int i35 = 10;
        jg7 jg7Var2 = jg7.a;
        ne2 ne2Var = this.B;
        int i36 = 1;
        zn0 zn0Var2 = null;
        switch (i33) {
            case 0:
                if (r41Var instanceof z6) {
                    z6Var = (z6) r41Var;
                    int i37 = z6Var.X;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        z6Var.X = i37 - Integer.MIN_VALUE;
                        Object obj3 = z6Var.R;
                        x61 x61Var = x61.COROUTINE_SUSPENDED;
                        i = z6Var.X;
                        if (i == 0) {
                            if (i == 1) {
                                oi2.Y(obj3);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj3);
                            yz4 yz4Var = new yz4((ra5) obj);
                            z6Var.X = 1;
                            if (ne2Var.a(yz4Var, z6Var) == x61Var) {
                                return x61Var;
                            }
                        }
                        return jg7Var2;
                    }
                }
                z6Var = new z6(this, r41Var);
                Object obj32 = z6Var.R;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                i = z6Var.X;
                if (i == 0) {
                }
                return jg7Var2;
            case 1:
                if (r41Var instanceof c7) {
                    c7Var = (c7) r41Var;
                    int i38 = c7Var.X;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        c7Var.X = i38 - Integer.MIN_VALUE;
                        Object obj4 = c7Var.R;
                        x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                        i2 = c7Var.X;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                oi2.Y(obj4);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj4);
                            ca5 ca5Var = (ca5) obj;
                            if (ca5Var instanceof q95) {
                                obj2 = new wz4(((q95) ca5Var).a);
                            } else if (ca5Var instanceof s95) {
                                obj2 = new xz4((s95) ca5Var);
                            } else {
                                obj2 = null;
                            }
                            if (obj2 != null) {
                                c7Var.X = 1;
                                if (ne2Var.a(obj2, c7Var) == x61Var3) {
                                    return x61Var3;
                                }
                            }
                        }
                        return jg7Var2;
                    }
                }
                c7Var = new c7(this, r41Var);
                Object obj42 = c7Var.R;
                x61 x61Var32 = x61.COROUTINE_SUSPENDED;
                i2 = c7Var.X;
                if (i2 == 0) {
                }
                return jg7Var2;
            case 2:
                if (r41Var instanceof gl) {
                    glVar = (gl) r41Var;
                    int i39 = glVar.X;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        glVar.X = i39 - Integer.MIN_VALUE;
                        Object obj5 = glVar.R;
                        x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                        i3 = glVar.X;
                        if (i3 == 0) {
                            if (i3 == 1) {
                                oi2.Y(obj5);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj5);
                            List<nw2> list = (List) obj;
                            int k0 = c14.k0(ht0.v0(list, 10));
                            if (k0 < 16) {
                                k0 = 16;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap(k0);
                            for (nw2 nw2Var : list) {
                                linkedHashMap.put(nw2Var.a, nw2Var.b);
                            }
                            glVar.X = 1;
                            if (ne2Var.a(linkedHashMap, glVar) == x61Var4) {
                                return x61Var4;
                            }
                        }
                        return jg7Var2;
                    }
                }
                glVar = new gl(this, r41Var);
                Object obj52 = glVar.R;
                x61 x61Var42 = x61.COROUTINE_SUSPENDED;
                i3 = glVar.X;
                if (i3 == 0) {
                }
                return jg7Var2;
            case 3:
                if (r41Var instanceof an) {
                    anVar = (an) r41Var;
                    int i40 = anVar.X;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        anVar.X = i40 - Integer.MIN_VALUE;
                        Object obj6 = anVar.R;
                        x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                        i4 = anVar.X;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                oi2.Y(obj6);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj6);
                            List list2 = ((kv7) obj).a;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj7 : list2) {
                                if (obj7 instanceof lw2) {
                                    arrayList.add(obj7);
                                }
                            }
                            anVar.X = 1;
                            if (ne2Var.a(arrayList, anVar) == x61Var5) {
                                return x61Var5;
                            }
                        }
                        return jg7Var2;
                    }
                }
                anVar = new an(this, r41Var);
                Object obj62 = anVar.R;
                x61 x61Var52 = x61.COROUTINE_SUSPENDED;
                i4 = anVar.X;
                if (i4 == 0) {
                }
                return jg7Var2;
            case 4:
                if (r41Var instanceof kw) {
                    kwVar = (kw) r41Var;
                    int i41 = kwVar.X;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        kwVar.X = i41 - Integer.MIN_VALUE;
                        Object obj8 = kwVar.R;
                        x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                        i5 = kwVar.X;
                        if (i5 == 0) {
                            if (i5 == 1) {
                                oi2.Y(obj8);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj8);
                            long j = ((xi6) obj).a;
                            ge7 ge7Var3 = qj1.m;
                            if (j == 9205357640488583168L) {
                                wi6Var = wi6.c;
                            } else {
                                ve5 ve5Var = dk7.b;
                                if (xi6.e(j) >= 0.5d && xi6.c(j) >= 0.5d) {
                                    float e = xi6.e(j);
                                    if (!Float.isInfinite(e) && !Float.isNaN(e)) {
                                        ge7Var = new pj1(u24.E(xi6.e(j)));
                                    } else {
                                        ge7Var = ge7Var3;
                                    }
                                    float c = xi6.c(j);
                                    if (!Float.isInfinite(c) && !Float.isNaN(c)) {
                                        ge7Var3 = new pj1(u24.E(xi6.c(j)));
                                    }
                                    wi6Var = new wi6(ge7Var, ge7Var3);
                                } else {
                                    wi6Var = null;
                                }
                            }
                            if (wi6Var != null) {
                                kwVar.X = 1;
                                if (ne2Var.a(wi6Var, kwVar) == x61Var6) {
                                    return x61Var6;
                                }
                            }
                        }
                        return jg7Var2;
                    }
                }
                kwVar = new kw(this, r41Var);
                Object obj82 = kwVar.R;
                x61 x61Var62 = x61.COROUTINE_SUSPENDED;
                i5 = kwVar.X;
                if (i5 == 0) {
                }
                return jg7Var2;
            case 5:
                if (r41Var instanceof up0) {
                    up0Var = (up0) r41Var;
                    int i42 = up0Var.X;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        up0Var.X = i42 - Integer.MIN_VALUE;
                        Object obj9 = up0Var.R;
                        x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                        i6 = up0Var.X;
                        if (i6 == 0) {
                            if (i6 == 1) {
                                oi2.Y(obj9);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj9);
                            qp0 qp0Var = new qp0((List) obj);
                            up0Var.X = 1;
                            if (ne2Var.a(qp0Var, up0Var) == x61Var7) {
                                return x61Var7;
                            }
                        }
                        return jg7Var2;
                    }
                }
                up0Var = new up0(this, r41Var);
                Object obj92 = up0Var.R;
                x61 x61Var72 = x61.COROUTINE_SUSPENDED;
                i6 = up0Var.X;
                if (i6 == 0) {
                }
                return jg7Var2;
            case 6:
                if (r41Var instanceof xp0) {
                    xp0Var = (xp0) r41Var;
                    int i43 = xp0Var.X;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        xp0Var.X = i43 - Integer.MIN_VALUE;
                        Object obj10 = xp0Var.R;
                        x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                        i7 = xp0Var.X;
                        if (i7 == 0) {
                            if (i7 == 1) {
                                oi2.Y(obj10);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj10);
                            pp2 pp2Var = (pp2) obj;
                            if (pp2Var != null) {
                                cp2Var = pp2Var.a();
                            } else {
                                cp2Var = null;
                            }
                            xp0Var.X = 1;
                            if (ne2Var.a(cp2Var, xp0Var) == x61Var8) {
                                return x61Var8;
                            }
                        }
                        return jg7Var2;
                    }
                }
                xp0Var = new xp0(this, r41Var);
                Object obj102 = xp0Var.R;
                x61 x61Var82 = x61.COROUTINE_SUSPENDED;
                i7 = xp0Var.X;
                if (i7 == 0) {
                }
                return jg7Var2;
            case 7:
                if (r41Var instanceof zp0) {
                    zp0Var = (zp0) r41Var;
                    int i44 = zp0Var.X;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        zp0Var.X = i44 - Integer.MIN_VALUE;
                        Object obj11 = zp0Var.R;
                        x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                        i8 = zp0Var.X;
                        if (i8 == 0) {
                            if (i8 == 1) {
                                oi2.Y(obj11);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj11);
                            dn0 dn0Var = (dn0) obj;
                            if (dn0Var != null) {
                                an0Var = dn0Var.a();
                            } else {
                                an0Var = null;
                            }
                            zp0Var.X = 1;
                            if (ne2Var.a(an0Var, zp0Var) == x61Var9) {
                                return x61Var9;
                            }
                        }
                        return jg7Var2;
                    }
                }
                zp0Var = new zp0(this, r41Var);
                Object obj112 = zp0Var.R;
                x61 x61Var92 = x61.COROUTINE_SUSPENDED;
                i8 = zp0Var.X;
                if (i8 == 0) {
                }
                return jg7Var2;
            case 8:
                if (r41Var instanceof f21) {
                    f21Var = (f21) r41Var;
                    int i45 = f21Var.X;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        f21Var.X = i45 - Integer.MIN_VALUE;
                        Object obj12 = f21Var.R;
                        x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                        i9 = f21Var.X;
                        if (i9 == 0) {
                            if (i9 == 1) {
                                oi2.Y(obj12);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj12);
                            if (obj instanceof w21) {
                                f21Var.X = 1;
                                if (ne2Var.a(obj, f21Var) == x61Var10) {
                                    return x61Var10;
                                }
                            }
                        }
                        return jg7Var2;
                    }
                }
                f21Var = new f21(this, r41Var);
                Object obj122 = f21Var.R;
                x61 x61Var102 = x61.COROUTINE_SUSPENDED;
                i9 = f21Var.X;
                if (i9 == 0) {
                }
                return jg7Var2;
            case 9:
                if (r41Var instanceof t21) {
                    t21Var = (t21) r41Var;
                    int i46 = t21Var.X;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        t21Var.X = i46 - Integer.MIN_VALUE;
                        Object obj13 = t21Var.R;
                        x61 x61Var11 = x61.COROUTINE_SUSPENDED;
                        i10 = t21Var.X;
                        if (i10 == 0) {
                            if (i10 == 1) {
                                oi2.Y(obj13);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj13);
                            long j2 = ((q21) obj).a;
                            ve5 ve5Var2 = dk7.b;
                            ge7 ge7Var4 = qj1.m;
                            int i47 = (int) (3 & j2);
                            int i48 = (((int) (j2 >> 33)) & ((1 << (i11 + 13)) - 1)) - 1;
                            int i49 = (((1 << (18 - i11)) - 1) & ((int) (j2 >> (((((i47 & 2) >> 1) * 3) + ((i47 & 1) << 1)) + 46)))) - 1;
                            if (i48 == 0) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                            if (i49 == 0) {
                                i34 = 1;
                            }
                            if ((i34 | i12) != 0) {
                                wi6Var2 = null;
                            } else {
                                if (q21.d(j2)) {
                                    ge7Var2 = new pj1(q21.h(j2));
                                } else {
                                    ge7Var2 = ge7Var4;
                                }
                                if (q21.c(j2)) {
                                    ge7Var4 = new pj1(q21.g(j2));
                                }
                                wi6Var2 = new wi6(ge7Var2, ge7Var4);
                            }
                            if (wi6Var2 != null) {
                                t21Var.X = 1;
                                if (ne2Var.a(wi6Var2, t21Var) == x61Var11) {
                                    return x61Var11;
                                }
                            }
                        }
                        return jg7Var2;
                    }
                }
                t21Var = new t21(this, r41Var);
                Object obj132 = t21Var.R;
                x61 x61Var112 = x61.COROUTINE_SUSPENDED;
                i10 = t21Var.X;
                if (i10 == 0) {
                }
                return jg7Var2;
            case 10:
                if (r41Var instanceof wa1) {
                    wa1Var = (wa1) r41Var;
                    int i50 = wa1Var.X;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        wa1Var.X = i50 - Integer.MIN_VALUE;
                        Object obj14 = wa1Var.R;
                        x61 x61Var12 = x61.COROUTINE_SUSPENDED;
                        i13 = wa1Var.X;
                        if (i13 == 0) {
                            if (i13 == 1) {
                                oi2.Y(obj14);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj14);
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj15 : (List) obj) {
                                pq5 pq5Var = (pq5) obj15;
                                if (!pq5Var.h) {
                                    if (!xs6.Y(pq5Var.c, ".dsi", true)) {
                                        String path = pq5Var.d.getPath();
                                        if (path != null && xs6.Y(path, ".dsi", true)) {
                                        }
                                    }
                                }
                                arrayList2.add(obj15);
                            }
                            wa1Var.X = 1;
                            if (ne2Var.a(arrayList2, wa1Var) == x61Var12) {
                                return x61Var12;
                            }
                        }
                        return jg7Var2;
                    }
                }
                wa1Var = new wa1(this, r41Var);
                Object obj142 = wa1Var.R;
                x61 x61Var122 = x61.COROUTINE_SUSPENDED;
                i13 = wa1Var.X;
                if (i13 == 0) {
                }
                return jg7Var2;
            case 11:
                if (r41Var instanceof yv1) {
                    yv1Var = (yv1) r41Var;
                    int i51 = yv1Var.X;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        yv1Var.X = i51 - Integer.MIN_VALUE;
                        Object obj16 = yv1Var.R;
                        x61 x61Var13 = x61.COROUTINE_SUSPENDED;
                        i14 = yv1Var.X;
                        if (i14 == 0) {
                            if (i14 == 1) {
                                oi2.Y(obj16);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj16);
                            if (obj instanceof ba5) {
                                yv1Var.X = 1;
                                if (ne2Var.a(obj, yv1Var) == x61Var13) {
                                    return x61Var13;
                                }
                            }
                        }
                        return jg7Var2;
                    }
                }
                yv1Var = new yv1(this, r41Var);
                Object obj162 = yv1Var.R;
                x61 x61Var132 = x61.COROUTINE_SUSPENDED;
                i14 = yv1Var.X;
                if (i14 == 0) {
                }
                return jg7Var2;
            case 12:
                if (r41Var instanceof ox1) {
                    ox1Var = (ox1) r41Var;
                    int i52 = ox1Var.X;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        ox1Var.X = i52 - Integer.MIN_VALUE;
                        Object obj17 = ox1Var.R;
                        x61 x61Var14 = x61.COROUTINE_SUSPENDED;
                        i15 = ox1Var.X;
                        if (i15 == 0) {
                            if (i15 == 1) {
                                oi2.Y(obj17);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj17);
                            if (((Boolean) obj).booleanValue()) {
                                ox1Var.X = 1;
                                if (ne2Var.a(obj, ox1Var) == x61Var14) {
                                    return x61Var14;
                                }
                            }
                        }
                        return jg7Var2;
                    }
                }
                ox1Var = new ox1(this, r41Var);
                Object obj172 = ox1Var.R;
                x61 x61Var142 = x61.COROUTINE_SUSPENDED;
                i15 = ox1Var.X;
                if (i15 == 0) {
                }
                return jg7Var2;
            case 13:
                if (r41Var instanceof px1) {
                    px1Var = (px1) r41Var;
                    int i53 = px1Var.X;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        px1Var.X = i53 - Integer.MIN_VALUE;
                        Object obj18 = px1Var.R;
                        x61 x61Var15 = x61.COROUTINE_SUSPENDED;
                        i16 = px1Var.X;
                        if (i16 == 0) {
                            if (i16 == 1) {
                                oi2.Y(obj18);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj18);
                            ((Boolean) obj).getClass();
                            Boolean bool = Boolean.FALSE;
                            px1Var.X = 1;
                            if (ne2Var.a(bool, px1Var) == x61Var15) {
                                return x61Var15;
                            }
                        }
                        return jg7Var2;
                    }
                }
                px1Var = new px1(this, r41Var);
                Object obj182 = px1Var.R;
                x61 x61Var152 = x61.COROUTINE_SUSPENDED;
                i16 = px1Var.X;
                if (i16 == 0) {
                }
                return jg7Var2;
            case 14:
                if (r41Var instanceof v02) {
                    v02Var = (v02) r41Var;
                    int i54 = v02Var.X;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        v02Var.X = i54 - Integer.MIN_VALUE;
                        Object obj19 = v02Var.R;
                        x61 x61Var16 = x61.COROUTINE_SUSPENDED;
                        i17 = v02Var.X;
                        if (i17 == 0) {
                            if (i17 == 1) {
                                oi2.Y(obj19);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj19);
                            if (((hy1) obj).a()) {
                                v02Var.X = 1;
                                if (ne2Var.a(obj, v02Var) == x61Var16) {
                                    return x61Var16;
                                }
                            }
                        }
                        return jg7Var2;
                    }
                }
                v02Var = new v02(this, r41Var);
                Object obj192 = v02Var.R;
                x61 x61Var162 = x61.COROUTINE_SUSPENDED;
                i17 = v02Var.X;
                if (i17 == 0) {
                }
                return jg7Var2;
            case 15:
                if (r41Var instanceof w02) {
                    w02Var = (w02) r41Var;
                    int i55 = w02Var.X;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        w02Var.X = i55 - Integer.MIN_VALUE;
                        Object obj20 = w02Var.R;
                        x61 x61Var17 = x61.COROUTINE_SUSPENDED;
                        i18 = w02Var.X;
                        if (i18 == 0) {
                            if (i18 == 1) {
                                oi2.Y(obj20);
                                return jg7Var2;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj20);
                        hy1 hy1Var = (hy1) obj;
                        w02Var.X = 1;
                        if (ne2Var.a(jg7Var2, w02Var) == x61Var17) {
                            return x61Var17;
                        }
                        return jg7Var2;
                    }
                }
                w02Var = new w02(this, r41Var);
                Object obj202 = w02Var.R;
                x61 x61Var172 = x61.COROUTINE_SUSPENDED;
                i18 = w02Var.X;
                if (i18 == 0) {
                }
            case 16:
                if (r41Var instanceof vf2) {
                    vf2Var = (vf2) r41Var;
                    int i56 = vf2Var.X;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        vf2Var.X = i56 - Integer.MIN_VALUE;
                        Object obj21 = vf2Var.R;
                        x61 x61Var18 = x61.COROUTINE_SUSPENDED;
                        i19 = vf2Var.X;
                        if (i19 == 0) {
                            if (i19 == 1) {
                                oi2.Y(obj21);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj21);
                            if (obj != null) {
                                vf2Var.X = 1;
                                if (ne2Var.a(obj, vf2Var) == x61Var18) {
                                    return x61Var18;
                                }
                            }
                        }
                        return jg7Var2;
                    }
                }
                vf2Var = new vf2(this, r41Var);
                Object obj212 = vf2Var.R;
                x61 x61Var182 = x61.COROUTINE_SUSPENDED;
                i19 = vf2Var.X;
                if (i19 == 0) {
                }
                return jg7Var2;
            case 17:
                if (r41Var instanceof ga3) {
                    ga3Var = (ga3) r41Var;
                    int i57 = ga3Var.X;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        ga3Var.X = i57 - Integer.MIN_VALUE;
                        Object obj22 = ga3Var.R;
                        x61 x61Var19 = x61.COROUTINE_SUSPENDED;
                        i20 = ga3Var.X;
                        if (i20 == 0) {
                            if (i20 == 1) {
                                oi2.Y(obj22);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj22);
                            ArrayList z = mb3.z((List) obj);
                            ga3Var.X = 1;
                            if (ne2Var.a(z, ga3Var) == x61Var19) {
                                return x61Var19;
                            }
                        }
                        return jg7Var2;
                    }
                }
                ga3Var = new ga3(this, r41Var);
                Object obj222 = ga3Var.R;
                x61 x61Var192 = x61.COROUTINE_SUSPENDED;
                i20 = ga3Var.X;
                if (i20 == 0) {
                }
                return jg7Var2;
            case 18:
                if (r41Var instanceof qa3) {
                    qa3Var = (qa3) r41Var;
                    int i58 = qa3Var.X;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        qa3Var.X = i58 - Integer.MIN_VALUE;
                        Object obj23 = qa3Var.R;
                        x61 x61Var20 = x61.COROUTINE_SUSPENDED;
                        i21 = qa3Var.X;
                        if (i21 == 0) {
                            if (i21 == 1) {
                                oi2.Y(obj23);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj23);
                            ArrayList z2 = mb3.z((List) obj);
                            qa3Var.X = 1;
                            if (ne2Var.a(z2, qa3Var) == x61Var20) {
                                return x61Var20;
                            }
                        }
                        return jg7Var2;
                    }
                }
                qa3Var = new qa3(this, r41Var);
                Object obj232 = qa3Var.R;
                x61 x61Var202 = x61.COROUTINE_SUSPENDED;
                i21 = qa3Var.X;
                if (i21 == 0) {
                }
                return jg7Var2;
            case 19:
                if (r41Var instanceof vl3) {
                    vl3Var = (vl3) r41Var;
                    int i59 = vl3Var.X;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        vl3Var.X = i59 - Integer.MIN_VALUE;
                        Object obj24 = vl3Var.R;
                        x61 x61Var21 = x61.COROUTINE_SUSPENDED;
                        i22 = vl3Var.X;
                        if (i22 == 0) {
                            if (i22 == 1) {
                                oi2.Y(obj24);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj24);
                            z66 z66Var = ((w71) obj).a.a;
                            lj3 lj3Var = new lj3(z66Var.a, z66Var.b);
                            vl3Var.X = 1;
                            if (ne2Var.a(lj3Var, vl3Var) == x61Var21) {
                                return x61Var21;
                            }
                        }
                        return jg7Var2;
                    }
                }
                vl3Var = new vl3(this, r41Var);
                Object obj242 = vl3Var.R;
                x61 x61Var212 = x61.COROUTINE_SUSPENDED;
                i22 = vl3Var.X;
                if (i22 == 0) {
                }
                return jg7Var2;
            case 20:
                if (r41Var instanceof xl3) {
                    xl3Var = (xl3) r41Var;
                    int i60 = xl3Var.X;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        xl3Var.X = i60 - Integer.MIN_VALUE;
                        Object obj25 = xl3Var.R;
                        x61 x61Var22 = x61.COROUTINE_SUSPENDED;
                        i23 = xl3Var.X;
                        if (i23 == 0) {
                            if (i23 == 1) {
                                oi2.Y(obj25);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj25);
                            z66 z66Var2 = ((w71) obj).a.b;
                            lj3 lj3Var2 = new lj3(z66Var2.a, z66Var2.b);
                            xl3Var.X = 1;
                            if (ne2Var.a(lj3Var2, xl3Var) == x61Var22) {
                                return x61Var22;
                            }
                        }
                        return jg7Var2;
                    }
                }
                xl3Var = new xl3(this, r41Var);
                Object obj252 = xl3Var.R;
                x61 x61Var222 = x61.COROUTINE_SUSPENDED;
                i23 = xl3Var.X;
                if (i23 == 0) {
                }
                return jg7Var2;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                Object obj26 = null;
                if (r41Var instanceof ax4) {
                    ax4Var = (ax4) r41Var;
                    int i61 = ax4Var.X;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        ax4Var.X = i61 - Integer.MIN_VALUE;
                        Object obj27 = ax4Var.R;
                        x61 x61Var23 = x61.COROUTINE_SUSPENDED;
                        i24 = ax4Var.X;
                        if (i24 == 0) {
                            if (i24 == 1) {
                                oi2.Y(obj27);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj27);
                            ArrayList arrayList3 = new ArrayList();
                            for (xf0 xf0Var : (List) obj) {
                                String str = xf0Var.a;
                                ?? r6 = obj26;
                                try {
                                    yf0Var = nc1.J(str, r6, r6);
                                } catch (Exception e2) {
                                    Log.w("PipePresenceSrc", "Failed to create CameraIdentifier for pipeId: " + str, e2);
                                    yf0Var = r6;
                                }
                                if (yf0Var != null) {
                                    arrayList3.add(yf0Var);
                                }
                                obj26 = r6;
                            }
                            ax4Var.X = 1;
                            if (ne2Var.a(arrayList3, ax4Var) == x61Var23) {
                                return x61Var23;
                            }
                        }
                        return jg7Var2;
                    }
                }
                ax4Var = new ax4(this, r41Var);
                Object obj272 = ax4Var.R;
                x61 x61Var232 = x61.COROUTINE_SUSPENDED;
                i24 = ax4Var.X;
                if (i24 == 0) {
                }
                return jg7Var2;
            case 22:
                if (r41Var instanceof co5) {
                    co5Var = (co5) r41Var;
                    int i62 = co5Var.X;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        co5Var.X = i62 - Integer.MIN_VALUE;
                        Object obj28 = co5Var.R;
                        x61 x61Var24 = x61.COROUTINE_SUSPENDED;
                        i25 = co5Var.X;
                        if (i25 == 0) {
                            if (i25 == 1) {
                                oi2.Y(obj28);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj28);
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj29 : (List) obj) {
                                if (obj29 instanceof tn5) {
                                    arrayList4.add(obj29);
                                }
                            }
                            ArrayList arrayList5 = new ArrayList(ht0.v0(arrayList4, 10));
                            int size = arrayList4.size();
                            while (i34 < size) {
                                Object obj30 = arrayList4.get(i34);
                                i34++;
                                arrayList5.add(((tn5) obj30).a);
                            }
                            co5Var.X = 1;
                            if (ne2Var.a(arrayList5, co5Var) == x61Var24) {
                                return x61Var24;
                            }
                        }
                        return jg7Var2;
                    }
                }
                co5Var = new co5(this, r41Var);
                Object obj282 = co5Var.R;
                x61 x61Var242 = x61.COROUTINE_SUSPENDED;
                i25 = co5Var.X;
                if (i25 == 0) {
                }
                return jg7Var2;
            case ConnectionResult.API_DISABLED /* 23 */:
                if (r41Var instanceof do5) {
                    do5Var = (do5) r41Var;
                    int i63 = do5Var.X;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        do5Var.X = i63 - Integer.MIN_VALUE;
                        Object obj31 = do5Var.R;
                        x61 x61Var25 = x61.COROUTINE_SUSPENDED;
                        i26 = do5Var.X;
                        if (i26 == 0) {
                            if (i26 == 1) {
                                oi2.Y(obj31);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj31);
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Object obj33 : (List) obj) {
                                ar0 a = gh5.a(((vn5) obj33).getClass());
                                Object obj34 = linkedHashMap2.get(a);
                                if (obj34 == null) {
                                    obj34 = new ArrayList();
                                    linkedHashMap2.put(a, obj34);
                                }
                                ((List) obj34).add(obj33);
                            }
                            List list3 = (List) linkedHashMap2.get(gh5.a(tn5.class));
                            if (list3 != null) {
                                i27 = list3.size();
                            } else {
                                i27 = 0;
                            }
                            List list4 = (List) linkedHashMap2.get(gh5.a(un5.class));
                            if (list4 != null) {
                                i34 = list4.size();
                            }
                            zn5 zn5Var = new zn5(i27, i34);
                            do5Var.X = 1;
                            if (ne2Var.a(zn5Var, do5Var) == x61Var25) {
                                return x61Var25;
                            }
                        }
                        return jg7Var2;
                    }
                }
                do5Var = new do5(this, r41Var);
                Object obj312 = do5Var.R;
                x61 x61Var252 = x61.COROUTINE_SUSPENDED;
                i26 = do5Var.X;
                if (i26 == 0) {
                }
                return jg7Var2;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                if (r41Var instanceof ls5) {
                    ls5Var = (ls5) r41Var;
                    int i64 = ls5Var.X;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        ls5Var.X = i64 - Integer.MIN_VALUE;
                        Object obj35 = ls5Var.R;
                        x61 x61Var26 = x61.COROUTINE_SUSPENDED;
                        i28 = ls5Var.X;
                        if (i28 == 0) {
                            if (i28 == 1) {
                                oi2.Y(obj35);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj35);
                            if (((Boolean) obj).booleanValue()) {
                                ls5Var.X = 1;
                                if (ne2Var.a(obj, ls5Var) == x61Var26) {
                                    return x61Var26;
                                }
                            }
                        }
                        return jg7Var2;
                    }
                }
                ls5Var = new ls5(this, r41Var);
                Object obj352 = ls5Var.R;
                x61 x61Var262 = x61.COROUTINE_SUSPENDED;
                i28 = ls5Var.X;
                if (i28 == 0) {
                }
                return jg7Var2;
            case 25:
                if (r41Var instanceof sz5) {
                    sz5Var = (sz5) r41Var;
                    int i65 = sz5Var.X;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        sz5Var.X = i65 - Integer.MIN_VALUE;
                        Object obj36 = sz5Var.R;
                        x61 x61Var27 = x61.COROUTINE_SUSPENDED;
                        i29 = sz5Var.X;
                        if (i29 == 0) {
                            if (i29 == 1) {
                                oi2.Y(obj36);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj36);
                            Set p1 = gt0.p1((List) obj);
                            sz5Var.X = 1;
                            if (ne2Var.a(p1, sz5Var) == x61Var27) {
                                return x61Var27;
                            }
                        }
                        return jg7Var2;
                    }
                }
                sz5Var = new sz5(this, r41Var);
                Object obj362 = sz5Var.R;
                x61 x61Var272 = x61.COROUTINE_SUSPENDED;
                i29 = sz5Var.X;
                if (i29 == 0) {
                }
                return jg7Var2;
            case SubAllocator.N4 /* 26 */:
                if (r41Var instanceof z06) {
                    z06Var = (z06) r41Var;
                    int i66 = z06Var.X;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        z06Var.X = i66 - Integer.MIN_VALUE;
                        Object obj37 = z06Var.R;
                        x61 x61Var28 = x61.COROUTINE_SUSPENDED;
                        i30 = z06Var.X;
                        if (i30 == 0) {
                            if (i30 == 1) {
                                oi2.Y(obj37);
                                jg7Var = jg7Var2;
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj37);
                            List list5 = (List) obj;
                            ArrayList arrayList6 = new ArrayList(ht0.v0(list5, 10));
                            Iterator it = list5.iterator();
                            while (it.hasNext()) {
                                en0 en0Var = (en0) it.next();
                                cn0 cn0Var = en0Var.a;
                                if (cn0Var != null) {
                                    Long l = cn0Var.a;
                                    if (cn0Var != null) {
                                        String str2 = cn0Var.c;
                                        List<zm0> list6 = en0Var.b;
                                        if (list6 != null) {
                                            ArrayList arrayList7 = new ArrayList(ht0.v0(list6, i35));
                                            for (zm0 zm0Var : list6) {
                                                arrayList7.add(new Cheat(zm0Var.a, zm0Var.c, zm0Var.d, zm0Var.e, zm0Var.f, zm0Var.g));
                                                it = it;
                                                jg7Var2 = jg7Var2;
                                                zn0Var2 = zn0Var2;
                                            }
                                            arrayList6.add(new an0(l, str2, arrayList7));
                                            it = it;
                                            i35 = 10;
                                            i36 = 1;
                                        } else {
                                            ?? r23 = zn0Var2;
                                            nb3.a0("cheats");
                                            throw r23;
                                        }
                                    } else {
                                        ?? r232 = zn0Var2;
                                        nb3.a0("cheatFolder");
                                        throw r232;
                                    }
                                } else {
                                    ?? r233 = zn0Var2;
                                    nb3.a0("cheatFolder");
                                    throw r233;
                                }
                            }
                            jg7Var = jg7Var2;
                            z06Var.X = i36;
                            if (ne2Var.a(arrayList6, z06Var) == x61Var28) {
                                return x61Var28;
                            }
                        }
                        return jg7Var;
                    }
                }
                z06Var = new z06(this, r41Var);
                Object obj372 = z06Var.R;
                x61 x61Var282 = x61.COROUTINE_SUSPENDED;
                i30 = z06Var.X;
                if (i30 == 0) {
                }
                return jg7Var;
            case 27:
                if (r41Var instanceof b16) {
                    b16Var = (b16) r41Var;
                    int i67 = b16Var.X;
                    if ((i67 & Integer.MIN_VALUE) != 0) {
                        b16Var.X = i67 - Integer.MIN_VALUE;
                        Object obj38 = b16Var.R;
                        x61 x61Var29 = x61.COROUTINE_SUSPENDED;
                        i31 = b16Var.X;
                        if (i31 == 0) {
                            if (i31 == 1) {
                                oi2.Y(obj38);
                                return jg7Var2;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                        } else {
                            oi2.Y(obj38);
                            List<jw7> list7 = (List) obj;
                            if (list7 == null || !list7.isEmpty()) {
                                for (jw7 jw7Var : list7) {
                                    if (!jw7Var.b.isFinished()) {
                                        jw7 jw7Var2 = (jw7) gt0.H0(list7);
                                        iw7 iw7Var = jw7Var2.b;
                                        xb1 xb1Var = jw7Var2.e;
                                        switch (q06.a[iw7Var.ordinal()]) {
                                            case 1:
                                                zn0Var = new zn0(yn0.STARTING, RecyclerView.B1, null);
                                                zn0Var2 = zn0Var;
                                                break;
                                            case 2:
                                                xb1Var.getClass();
                                                Float valueOf = Float.valueOf((float) RecyclerView.B1);
                                                ?? r4 = xb1Var.a.get("progress_relative");
                                                if (r4 instanceof Float) {
                                                    valueOf = r4;
                                                }
                                                zn0Var2 = new zn0(yn0.ONGOING, valueOf.floatValue(), xb1Var.b("progress_item"));
                                                break;
                                            case 3:
                                                zn0Var = new zn0(yn0.FINISHED, 1.0f, null);
                                                zn0Var2 = zn0Var;
                                                break;
                                            case 4:
                                            case 5:
                                                zn0Var = new zn0(yn0.FAILED, RecyclerView.B1, null);
                                                zn0Var2 = zn0Var;
                                                break;
                                            case 6:
                                                break;
                                            default:
                                                i.d();
                                                break;
                                        }
                                        if (zn0Var2 == null) {
                                            b16Var.X = 1;
                                            if (ne2Var.a(zn0Var2, b16Var) == x61Var29) {
                                                return x61Var29;
                                            }
                                            return jg7Var2;
                                        }
                                        return jg7Var2;
                                    }
                                }
                            }
                            zn0Var = new zn0(yn0.NOT_IMPORTING, RecyclerView.B1, null);
                            zn0Var2 = zn0Var;
                            if (zn0Var2 == null) {
                            }
                        }
                        return null;
                    }
                }
                b16Var = new b16(this, r41Var);
                Object obj382 = b16Var.R;
                x61 x61Var292 = x61.COROUTINE_SUSPENDED;
                i31 = b16Var.X;
                if (i31 == 0) {
                }
                return null;
            case 28:
                return b(r41Var, obj);
            default:
                if (r41Var instanceof zw7) {
                    zw7Var = (zw7) r41Var;
                    int i68 = zw7Var.X;
                    if ((i68 & Integer.MIN_VALUE) != 0) {
                        zw7Var.X = i68 - Integer.MIN_VALUE;
                        Object obj39 = zw7Var.R;
                        x61 x61Var30 = x61.COROUTINE_SUSPENDED;
                        i32 = zw7Var.X;
                        if (i32 == 0) {
                            if (i32 == 1) {
                                oi2.Y(obj39);
                                return jg7Var2;
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oi2.Y(obj39);
                        List<xw7> list8 = (List) obj;
                        ArrayList arrayList8 = new ArrayList(ht0.v0(list8, 10));
                        for (xw7 xw7Var : list8) {
                            arrayList8.add(xw7Var.a());
                        }
                        zw7Var.X = 1;
                        if (ne2Var.a(arrayList8, zw7Var) == x61Var30) {
                            return x61Var30;
                        }
                        return jg7Var2;
                    }
                }
                zw7Var = new zw7(this, r41Var);
                Object obj392 = zw7Var.R;
                x61 x61Var302 = x61.COROUTINE_SUSPENDED;
                i32 = zw7Var.X;
                if (i32 == 0) {
                }
        }
    }
}
