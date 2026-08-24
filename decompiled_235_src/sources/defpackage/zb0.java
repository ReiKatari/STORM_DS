package defpackage;

import android.os.Build;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.util.Log;
import android.view.InputDevice;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb0  reason: default package */
/* loaded from: classes.dex */
public final class zb0 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;

    public /* synthetic */ zb0(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:239:0x041e, code lost:
        if (r12.a(r13, r0) != r1) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x04c6, code lost:
        if (r14 == r1) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04df, code lost:
        if (r13 == r1) goto L303;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007f, code lost:
        if ((!r12) == true) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009a, code lost:
        if (r12.k() != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009c, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:546:?, code lost:
        return r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04e6  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x050f  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x051c  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0558  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0568  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x068f  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x069c  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0721  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x072d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00dc  */
    /* JADX WARN: Type inference failed for: r12v112 */
    /* JADX WARN: Type inference failed for: r12v118 */
    /* JADX WARN: Type inference failed for: r14v66, types: [java.lang.Object, ka0] */
    @Override // defpackage.ne2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Object obj, r41 r41Var) {
        tp0 tp0Var;
        int i;
        vp0 vp0Var;
        int i2;
        op opVar;
        op opVar2;
        List b0;
        VibratorManager vibratorManager;
        int[] vibratorIds;
        Vibrator vibrator;
        Vibrator defaultVibrator;
        ff2 ff2Var;
        int i3;
        hf2 hf2Var;
        int i4;
        nf2 nf2Var;
        Object obj2;
        int i5;
        ?? r12;
        zb0 zb0Var;
        zb0 zb0Var2;
        qf2 qf2Var;
        Object obj3;
        int i6;
        ?? r122;
        wf2 wf2Var;
        int i7;
        ne2 ne2Var;
        ta3 ta3Var;
        int i8;
        Object obj4;
        sd4 sd4Var;
        int i9;
        ig6 ig6Var;
        int i10;
        mg6 mg6Var;
        int i11;
        String[] list;
        boolean z;
        boolean z2 = false;
        r4 = false;
        r4 = false;
        r4 = false;
        r4 = false;
        r4 = false;
        boolean z3 = false;
        Object obj5 = null;
        switch (this.A) {
            case 0:
                String str = ((xf0) obj).a;
                jg7 jg7Var = jg7.a;
                if (nb3.k(str, (String) this.B)) {
                    Log.d("CXCP", ((Object) xf0.b(str)) + " has become available! Notifying listeners...");
                    Iterator it = ((cc0) this.L).B.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        ((tu0) it.next()).b0(jg7Var);
                    }
                }
                return jg7Var;
            case 1:
                oh0 oh0Var = (oh0) obj;
                if (oh0Var instanceof vh0) {
                    yk0 yk0Var = (yk0) ((dh5) this.B).A;
                    bf0 bf0Var = ((vh0) oh0Var).a;
                    synchronized (yk0Var.k) {
                        uk0 uk0Var = yk0Var.u;
                        if (uk0Var != uk0.CLOSING && uk0Var != uk0.CLOSED) {
                            yk0Var.q = bf0Var;
                            hv.L(yk0Var.i, null, null, new vk0(yk0Var, null, 0), 3);
                        }
                    }
                } else if (oh0Var instanceof uh0) {
                    ((yk0) ((dh5) this.B).A).o();
                } else if (oh0Var instanceof th0) {
                    ((yk0) ((dh5) this.B).A).o();
                    kc0 kc0Var = (kc0) this.L;
                    th0 th0Var = (th0) oh0Var;
                    synchronized (kc0Var.q) {
                        try {
                            if (!kc0Var.e()) {
                                df0 df0Var = th0Var.i;
                                if (df0Var != null) {
                                    kc0Var.u = df0Var;
                                    int i12 = df0Var.a;
                                    if (i12 != 6 && i12 != 1 && i12 != 2) {
                                        kc0Var.s = xe0.x;
                                        Log.d("CXCP", kc0Var + " encountered error: " + ((Object) df0.a(th0Var.i.a)));
                                    }
                                    kc0Var.s = xe0.w;
                                    Log.d("CXCP", kc0Var + " is disconnected");
                                } else {
                                    kc0Var.s = xe0.z;
                                }
                                kc0Var.f.k();
                                kc0Var.g();
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return jg7.a;
            case 2:
                if (r41Var instanceof tp0) {
                    tp0Var = (tp0) r41Var;
                    int i13 = tp0Var.X;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        tp0Var.X = i13 - Integer.MIN_VALUE;
                        Object obj6 = tp0Var.R;
                        x61 x61Var = x61.COROUTINE_SUSPENDED;
                        i = tp0Var.X;
                        if (i == 0) {
                            if (i == 1) {
                                oi2.Y(obj6);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj6);
                            ne2 ne2Var2 = (ne2) this.B;
                            ArrayList m1 = gt0.m1((List) this.L);
                            for (Cheat cheat : (List) obj) {
                                int size = m1.size();
                                int i14 = 0;
                                int i15 = 0;
                                while (true) {
                                    if (i15 < size) {
                                        Object obj7 = m1.get(i15);
                                        i15++;
                                        if (!nb3.k(((Cheat) obj7).getId(), cheat.getId())) {
                                            i14++;
                                        }
                                    } else {
                                        i14 = -1;
                                    }
                                }
                                if (i14 >= 0) {
                                    m1.set(i14, cheat);
                                }
                            }
                            qp0 qp0Var = new qp0(m1);
                            tp0Var.X = 1;
                            if (ne2Var2.a(qp0Var, tp0Var) == x61Var) {
                                return x61Var;
                            }
                        }
                        return jg7.a;
                    }
                }
                tp0Var = new tp0(this, r41Var);
                Object obj62 = tp0Var.R;
                x61 x61Var2 = x61.COROUTINE_SUSPENDED;
                i = tp0Var.X;
                if (i == 0) {
                }
                return jg7.a;
            case 3:
                ArrayList arrayList = (ArrayList) this.L;
                if (r41Var instanceof vp0) {
                    vp0Var = (vp0) r41Var;
                    int i16 = vp0Var.X;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        vp0Var.X = i16 - Integer.MIN_VALUE;
                        Object obj8 = vp0Var.R;
                        x61 x61Var3 = x61.COROUTINE_SUSPENDED;
                        i2 = vp0Var.X;
                        if (i2 == 0) {
                            if (i2 == 1) {
                                oi2.Y(obj8);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj8);
                            ne2 ne2Var3 = (ne2) this.B;
                            for (Cheat cheat2 : (List) obj) {
                                int size2 = arrayList.size();
                                int i17 = 0;
                                int i18 = 0;
                                while (true) {
                                    if (i18 < size2) {
                                        Object obj9 = arrayList.get(i18);
                                        i18++;
                                        if (!nb3.k(((co0) obj9).a.getId(), cheat2.getId())) {
                                            i17++;
                                        }
                                    } else {
                                        i17 = -1;
                                    }
                                }
                                if (i17 >= 0) {
                                    arrayList.set(i17, new co0(cheat2, ((co0) arrayList.get(i17)).b));
                                }
                            }
                            qp0 qp0Var2 = new qp0(gt0.k1(arrayList));
                            vp0Var.X = 1;
                            if (ne2Var3.a(qp0Var2, vp0Var) == x61Var3) {
                                return x61Var3;
                            }
                        }
                        return jg7.a;
                    }
                }
                vp0Var = new vp0(this, r41Var);
                Object obj82 = vp0Var.R;
                x61 x61Var32 = x61.COROUTINE_SUSPENDED;
                i2 = vp0Var.X;
                if (i2 == 0) {
                }
                return jg7.a;
            case 4:
                yt1 yt1Var = yt1.A;
                bt btVar = (bt) this.B;
                ArrayList arrayList2 = new ArrayList();
                for (InputDevice inputDevice : (List) obj) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        vibratorManager = inputDevice.getVibratorManager();
                        vibratorManager.getClass();
                        vibratorIds = vibratorManager.getVibratorIds();
                        vibratorIds.getClass();
                        if (vibratorIds.length == 0) {
                            defaultVibrator = vibratorManager.getDefaultVibrator();
                            if (!defaultVibrator.hasVibrator()) {
                                defaultVibrator = null;
                            }
                            if (defaultVibrator != null) {
                                b0 = hf.b0(defaultVibrator);
                            }
                            b0 = yt1Var;
                        } else {
                            ArrayList arrayList3 = new ArrayList(vibratorIds.length);
                            for (int i19 : vibratorIds) {
                                vibrator = vibratorManager.getVibrator(i19);
                                arrayList3.add(vibrator);
                            }
                            b0 = arrayList3;
                        }
                    } else {
                        Vibrator vibrator2 = inputDevice.getVibrator();
                        if (!vibrator2.hasVibrator()) {
                            vibrator2 = null;
                        }
                        if (vibrator2 != null) {
                            b0 = hf.b0(vibrator2);
                        }
                        b0 = yt1Var;
                    }
                    gt0.A0(arrayList2, b0);
                }
                op opVar3 = (op) btVar.R;
                if (opVar3 != null) {
                    opVar3.b();
                }
                if (arrayList2.isEmpty()) {
                    Vibrator vibrator3 = (Vibrator) this.L;
                    if (vibrator3 != null) {
                        if (Build.VERSION.SDK_INT >= 26) {
                            opVar2 = new op(vibrator3, 0);
                        } else {
                            opVar2 = new op(vibrator3, 1);
                        }
                        obj5 = opVar2;
                    }
                } else {
                    ArrayList arrayList4 = new ArrayList(ht0.v0(arrayList2, 10));
                    int size3 = arrayList2.size();
                    int i20 = 0;
                    while (i20 < size3) {
                        Object obj10 = arrayList2.get(i20);
                        i20++;
                        Vibrator vibrator4 = (Vibrator) obj10;
                        if (Build.VERSION.SDK_INT >= 26) {
                            opVar = new op(vibrator4, 0);
                        } else {
                            opVar = new op(vibrator4, 1);
                        }
                        arrayList4.add(opVar);
                    }
                    obj5 = new op(arrayList4);
                }
                btVar.R = obj5;
                return jg7.a;
            case 5:
                ((zg5) this.B).A = true;
                xb2.a((xb2) this.L, (pq5) obj);
                return jg7.a;
            case 6:
                try {
                    if (r41Var instanceof ff2) {
                        ff2Var = (ff2) r41Var;
                        int i21 = ff2Var.Z;
                        if ((i21 & Integer.MIN_VALUE) != 0) {
                            ff2Var.Z = i21 - Integer.MIN_VALUE;
                            Object obj11 = ff2Var.X;
                            x61 x61Var4 = x61.COROUTINE_SUSPENDED;
                            i3 = ff2Var.Z;
                            if (i3 == 0) {
                                if (i3 == 1) {
                                    zb0 zb0Var3 = ff2Var.R;
                                    oi2.Y(obj11);
                                    this = zb0Var3;
                                } else {
                                    i.m("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                            } else {
                                oi2.Y(obj11);
                                ff2Var.R = this;
                                ff2Var.Z = 1;
                                Object a = ((ne2) this.B).a(obj, ff2Var);
                                this = a;
                                if (a == x61Var4) {
                                    return x61Var4;
                                }
                            }
                            return jg7.a;
                        }
                    }
                    if (i3 == 0) {
                    }
                    return jg7.a;
                } catch (Throwable th2) {
                    ((dh5) this.L).A = th2;
                    throw th2;
                }
                ff2Var = new ff2(this, r41Var);
                Object obj112 = ff2Var.X;
                x61 x61Var42 = x61.COROUTINE_SUSPENDED;
                i3 = ff2Var.Z;
            case 7:
                jg7 jg7Var2 = jg7.a;
                if (r41Var instanceof hf2) {
                    hf2Var = (hf2) r41Var;
                    int i22 = hf2Var.Y;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        hf2Var.Y = i22 - Integer.MIN_VALUE;
                        Object obj12 = hf2Var.R;
                        x61 x61Var5 = x61.COROUTINE_SUSPENDED;
                        i4 = hf2Var.Y;
                        if (i4 == 0) {
                            if (i4 == 1) {
                                oi2.Y(obj12);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj12);
                            bh5 bh5Var = (bh5) this.B;
                            int i23 = bh5Var.A;
                            if (i23 >= 1) {
                                hf2Var.Y = 1;
                                if (((ne2) this.L).a(obj, hf2Var) == x61Var5) {
                                    return x61Var5;
                                }
                            } else {
                                bh5Var.A = i23 + 1;
                            }
                        }
                        return jg7Var2;
                    }
                }
                hf2Var = new hf2(this, r41Var);
                Object obj122 = hf2Var.R;
                x61 x61Var52 = x61.COROUTINE_SUSPENDED;
                i4 = hf2Var.Y;
                if (i4 == 0) {
                }
                return jg7Var2;
            case 8:
                if (r41Var instanceof nf2) {
                    nf2Var = (nf2) r41Var;
                    int i24 = nf2Var.Y;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        nf2Var.Y = i24 - Integer.MIN_VALUE;
                        obj2 = nf2Var.X;
                        x61 x61Var6 = x61.COROUTINE_SUSPENDED;
                        i5 = nf2Var.Y;
                        if (i5 == 0) {
                            if (i5 != 1) {
                                if (i5 == 2) {
                                    zb0 zb0Var4 = nf2Var.R;
                                    oi2.Y(obj2);
                                    zb0Var2 = zb0Var4;
                                    z2 = true;
                                    zb0Var = zb0Var2;
                                    if (z2) {
                                        return jg7.a;
                                    }
                                    throw new o(zb0Var);
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = nf2Var.d0;
                            zb0 zb0Var5 = nf2Var.R;
                            oi2.Y(obj2);
                            r12 = zb0Var5;
                        } else {
                            oi2.Y(obj2);
                            nf2Var.R = this;
                            nf2Var.d0 = obj;
                            nf2Var.Y = 1;
                            obj2 = ((m8) this.B).o(obj, nf2Var);
                            this = this;
                            break;
                        }
                        zb0Var = r12;
                        if (((Boolean) obj2).booleanValue()) {
                            nf2Var.R = r12;
                            nf2Var.d0 = null;
                            nf2Var.Y = 2;
                            Object a2 = ((ne2) r12.L).a(obj, nf2Var);
                            zb0Var2 = r12;
                            break;
                        }
                        if (z2) {
                        }
                    }
                }
                nf2Var = new nf2(this, r41Var);
                obj2 = nf2Var.X;
                x61 x61Var62 = x61.COROUTINE_SUSPENDED;
                i5 = nf2Var.Y;
                if (i5 == 0) {
                }
                zb0Var = r12;
                if (((Boolean) obj2).booleanValue()) {
                }
                if (z2) {
                }
            case 9:
                if (r41Var instanceof qf2) {
                    qf2Var = (qf2) r41Var;
                    int i25 = qf2Var.Y;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        qf2Var.Y = i25 - Integer.MIN_VALUE;
                        obj3 = qf2Var.X;
                        x61 x61Var7 = x61.COROUTINE_SUSPENDED;
                        i6 = qf2Var.Y;
                        if (i6 == 0) {
                            if (i6 == 1) {
                                obj = qf2Var.d0;
                                zb0 zb0Var6 = qf2Var.R;
                                oi2.Y(obj3);
                                r122 = zb0Var6;
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj3);
                            qf2Var.R = this;
                            qf2Var.d0 = obj;
                            qf2Var.Y = 1;
                            obj3 = ((eo2) this.B).o(obj, qf2Var);
                            this = this;
                            if (obj3 == x61Var7) {
                                return x61Var7;
                            }
                        }
                        if (((Boolean) obj3).booleanValue()) {
                            return jg7.a;
                        }
                        ((dh5) r122.L).A = obj;
                        throw new o(r122);
                    }
                }
                qf2Var = new qf2(this, r41Var);
                obj3 = qf2Var.X;
                x61 x61Var72 = x61.COROUTINE_SUSPENDED;
                i6 = qf2Var.Y;
                if (i6 == 0) {
                }
                if (((Boolean) obj3).booleanValue()) {
                }
            case 10:
                if (r41Var instanceof wf2) {
                    wf2Var = (wf2) r41Var;
                    int i26 = wf2Var.X;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        wf2Var.X = i26 - Integer.MIN_VALUE;
                        Object obj13 = wf2Var.R;
                        x61 x61Var8 = x61.COROUTINE_SUSPENDED;
                        i7 = wf2Var.X;
                        if (i7 == 0) {
                            if (i7 != 1) {
                                if (i7 == 2) {
                                    oi2.Y(obj13);
                                    return jg7.a;
                                }
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ne2Var = wf2Var.d0;
                            obj = wf2Var.Z;
                            oi2.Y(obj13);
                        } else {
                            oi2.Y(obj13);
                            ne2 ne2Var4 = (ne2) this.B;
                            wf2Var.Z = obj;
                            wf2Var.d0 = ne2Var4;
                            wf2Var.X = 1;
                            if (((eo2) this.L).o(obj, wf2Var) != x61Var8) {
                                ne2Var = ne2Var4;
                            }
                            return x61Var8;
                        }
                        wf2Var.Z = null;
                        wf2Var.d0 = null;
                        wf2Var.X = 2;
                        break;
                    }
                }
                wf2Var = new wf2(this, r41Var);
                Object obj132 = wf2Var.R;
                x61 x61Var82 = x61.COROUTINE_SUSPENDED;
                i7 = wf2Var.X;
                if (i7 == 0) {
                }
                wf2Var.Z = null;
                wf2Var.d0 = null;
                wf2Var.X = 2;
            case 11:
                if (r41Var instanceof ta3) {
                    ta3Var = (ta3) r41Var;
                    int i27 = ta3Var.X;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        ta3Var.X = i27 - Integer.MIN_VALUE;
                        Object obj14 = ta3Var.R;
                        x61 x61Var9 = x61.COROUTINE_SUSPENDED;
                        i8 = ta3Var.X;
                        if (i8 == 0) {
                            if (i8 == 1) {
                                oi2.Y(obj14);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj14);
                            ne2 ne2Var5 = (ne2) this.B;
                            Iterator it2 = ((List) obj).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj4 = it2.next();
                                    fh1 fh1Var = (fh1) obj4;
                                    if (fh1Var.b || !nb3.k(((fk3) fh1Var.a).a, (UUID) this.L)) {
                                    }
                                } else {
                                    obj4 = null;
                                }
                            }
                            fh1 fh1Var2 = (fh1) obj4;
                            if (fh1Var2 != null) {
                                obj5 = (fk3) fh1Var2.a;
                            }
                            ta3Var.X = 1;
                            if (ne2Var5.a(obj5, ta3Var) == x61Var9) {
                                return x61Var9;
                            }
                        }
                        return jg7.a;
                    }
                }
                ta3Var = new ta3(this, r41Var);
                Object obj142 = ta3Var.R;
                x61 x61Var92 = x61.COROUTINE_SUSPENDED;
                i8 = ta3Var.X;
                if (i8 == 0) {
                }
                return jg7.a;
            case 12:
                ArrayList m12 = gt0.m1((List) obj);
                m12.add(0, (fk3) ((wa3) this.B).g.getValue());
                tp6 tp6Var = ((qn3) this.L).c;
                tp6Var.getClass();
                tp6Var.m(null, m12);
                return jg7.a;
            case 13:
                t93 t93Var = (t93) obj;
                vv3 vv3Var = (vv3) this.L;
                ca4 ca4Var = (ca4) this.B;
                if (!(t93Var instanceof oy2) && !(t93Var instanceof sg2) && !(t93Var instanceof l25)) {
                    if (t93Var instanceof py2) {
                        ca4Var.j(((py2) t93Var).a);
                    } else if (t93Var instanceof tg2) {
                        ca4Var.j(((tg2) t93Var).a);
                    } else if (t93Var instanceof m25) {
                        ca4Var.j(((m25) t93Var).a);
                    } else if (t93Var instanceof k25) {
                        ca4Var.j(((k25) t93Var).a);
                    }
                } else {
                    ca4Var.a(t93Var);
                }
                Object[] objArr = ca4Var.a;
                int i28 = ca4Var.b;
                int i29 = 0;
                for (int i30 = 0; i30 < i28; i30++) {
                    t93 t93Var2 = (t93) objArr[i30];
                    if (t93Var2 instanceof oy2) {
                        vv3Var.getClass();
                        i29 |= 2;
                    } else if (t93Var2 instanceof sg2) {
                        vv3Var.getClass();
                        i29 |= 1;
                    } else if (t93Var2 instanceof l25) {
                        vv3Var.getClass();
                        i29 |= 4;
                    }
                }
                vv3Var.b.i(i29);
                return jg7.a;
            case 14:
                if (r41Var instanceof sd4) {
                    sd4Var = (sd4) r41Var;
                    int i31 = sd4Var.X;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        sd4Var.X = i31 - Integer.MIN_VALUE;
                        Object obj15 = sd4Var.R;
                        x61 x61Var10 = x61.COROUTINE_SUSPENDED;
                        i9 = sd4Var.X;
                        if (i9 == 0) {
                            if (i9 == 1) {
                                oi2.Y(obj15);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj15);
                            jg7 jg7Var3 = (jg7) obj;
                            hj6 b = ((ud4) this.L).b();
                            sd4Var.X = 1;
                            if (((ne2) this.B).a(b, sd4Var) == x61Var10) {
                                return x61Var10;
                            }
                        }
                        return jg7.a;
                    }
                }
                sd4Var = new sd4(this, r41Var);
                Object obj152 = sd4Var.R;
                x61 x61Var102 = x61.COROUTINE_SUSPENDED;
                i9 = sd4Var.X;
                if (i9 == 0) {
                }
                return jg7.a;
            case 15:
                t93 t93Var3 = (t93) obj;
                boolean z4 = t93Var3 instanceof n25;
                ql qlVar = (ql) this.B;
                if (z4) {
                    if (qlVar.s0) {
                        qlVar.R0((n25) t93Var3);
                    } else {
                        qlVar.t0.a(t93Var3);
                    }
                } else {
                    w61 w61Var = (w61) this.L;
                    ka0 ka0Var = qlVar.p0;
                    float f = RecyclerView.B1;
                    ka0 ka0Var2 = ka0Var;
                    if (ka0Var == null) {
                        boolean z5 = qlVar.l0;
                        ch1 ch1Var = qlVar.o0;
                        ?? obj16 = new Object();
                        obj16.a = z5;
                        obj16.b = ch1Var;
                        obj16.c = nb3.b(RecyclerView.B1);
                        obj16.d = new ArrayList();
                        f04.I(qlVar);
                        qlVar.p0 = obj16;
                        ka0Var2 = obj16;
                    }
                    ArrayList arrayList5 = (ArrayList) ka0Var2.d;
                    if (t93Var3 instanceof oy2) {
                        arrayList5.add(t93Var3);
                    } else if (t93Var3 instanceof py2) {
                        arrayList5.remove(((py2) t93Var3).a);
                    } else if (t93Var3 instanceof sg2) {
                        arrayList5.add(t93Var3);
                    } else if (t93Var3 instanceof tg2) {
                        arrayList5.remove(((tg2) t93Var3).a);
                    } else if (t93Var3 instanceof ao1) {
                        arrayList5.add(t93Var3);
                    } else if (t93Var3 instanceof bo1) {
                        arrayList5.remove(((bo1) t93Var3).a);
                    } else if (t93Var3 instanceof zn1) {
                        arrayList5.remove(((zn1) t93Var3).a);
                    }
                    t93 t93Var4 = (t93) gt0.R0(arrayList5);
                    if (!nb3.k((t93) ka0Var2.e, t93Var4)) {
                        if (t93Var4 != null) {
                            eq5 eq5Var = (eq5) ((ch1) ka0Var2.b).c();
                            boolean z6 = t93Var4 instanceof oy2;
                            if (z6) {
                                f = eq5Var.c;
                            } else if (t93Var4 instanceof sg2) {
                                f = eq5Var.b;
                            } else if (t93Var4 instanceof ao1) {
                                f = eq5Var.a;
                            }
                            sc7 sc7Var = iq5.a;
                            if (!z6) {
                                if (t93Var4 instanceof sg2) {
                                    sc7Var = new sc7(45, ir1.c, 2);
                                } else if (t93Var4 instanceof ao1) {
                                    sc7Var = new sc7(45, ir1.c, 2);
                                }
                            }
                            hv.L(w61Var, null, null, new wc4(ka0Var2, f, sc7Var, (r41) null), 3);
                        } else {
                            t93 t93Var5 = (t93) ka0Var2.e;
                            sc7 sc7Var2 = iq5.a;
                            if (!(t93Var5 instanceof oy2) && !(t93Var5 instanceof sg2) && (t93Var5 instanceof ao1)) {
                                sc7Var2 = new sc7(150, ir1.c, 2);
                            }
                            hv.L(w61Var, null, null, new bf4(ka0Var2, sc7Var2, null, 20), 3);
                        }
                        ka0Var2.e = t93Var4;
                    }
                }
                return jg7.a;
            case 16:
                long j = ((jk4) obj).a;
                jg7 jg7Var4 = jg7.a;
                gn gnVar = (gn) this.B;
                if ((((jk4) gnVar.d()).a & 9223372034707292159L) != 9205357640488583168L && (j & 9223372034707292159L) != 9205357640488583168L && Float.intBitsToFloat((int) (((jk4) gnVar.d()).a & 4294967295L)) != Float.intBitsToFloat((int) (j & 4294967295L))) {
                    hv.L((w61) this.L, null, null, new jc0(gnVar, j, null), 3);
                    return jg7Var4;
                }
                Object e = gnVar.e(r41Var, new jk4(j));
                if (e == x61.COROUTINE_SUSPENDED) {
                    return e;
                }
                return jg7Var4;
            case 17:
                if (r41Var instanceof ig6) {
                    ig6Var = (ig6) r41Var;
                    int i32 = ig6Var.X;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        ig6Var.X = i32 - Integer.MIN_VALUE;
                        Object obj17 = ig6Var.R;
                        x61 x61Var11 = x61.COROUTINE_SUSPENDED;
                        i10 = ig6Var.X;
                        if (i10 == 0) {
                            if (i10 == 1) {
                                oi2.Y(obj17);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj17);
                            jg7 jg7Var5 = (jg7) obj;
                            Object c = ((on2) this.L).c();
                            ig6Var.X = 1;
                            if (((ne2) this.B).a(c, ig6Var) == x61Var11) {
                                return x61Var11;
                            }
                        }
                        return jg7.a;
                    }
                }
                ig6Var = new ig6(this, r41Var);
                Object obj172 = ig6Var.R;
                x61 x61Var112 = x61.COROUTINE_SUSPENDED;
                i10 = ig6Var.X;
                if (i10 == 0) {
                }
                return jg7.a;
            case 18:
                if (r41Var instanceof mg6) {
                    mg6Var = (mg6) r41Var;
                    int i33 = mg6Var.X;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        mg6Var.X = i33 - Integer.MIN_VALUE;
                        Object obj18 = mg6Var.R;
                        x61 x61Var12 = x61.COROUTINE_SUSPENDED;
                        i11 = mg6Var.X;
                        if (i11 == 0) {
                            if (i11 == 1) {
                                oi2.Y(obj18);
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj18);
                            ne2 ne2Var6 = (ne2) this.B;
                            bg6 bg6Var = (bg6) obj;
                            ng6 ng6Var = (ng6) this.L;
                            po5 po5Var = ng6.l;
                            if (bg6Var != null) {
                                if (bg6Var instanceof zf6) {
                                    File file = ((zf6) bg6Var).a;
                                    if (file.isDirectory() && (list = file.list()) != null) {
                                        if (list.length == 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        break;
                                    }
                                } else if (bg6Var instanceof ag6) {
                                    qi6 h = zl1.h(ng6Var.a, ((ag6) bg6Var).a);
                                    if (h.e()) {
                                        break;
                                    }
                                } else {
                                    i.d();
                                    return null;
                                }
                            }
                            Boolean valueOf = Boolean.valueOf(z3);
                            mg6Var.X = 1;
                            if (ne2Var6.a(valueOf, mg6Var) == x61Var12) {
                                return x61Var12;
                            }
                        }
                        return jg7.a;
                    }
                }
                mg6Var = new mg6(this, r41Var);
                Object obj182 = mg6Var.R;
                x61 x61Var122 = x61.COROUTINE_SUSPENDED;
                i11 = mg6Var.X;
                if (i11 == 0) {
                }
                return jg7.a;
            case 19:
                return b(((Number) obj).intValue(), r41Var);
            default:
                ((ll4) this.B).a((yw7) this.L, (x21) obj);
                return jg7.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(int i, r41 r41Var) {
        kp6 kp6Var;
        int i2;
        if (r41Var instanceof kp6) {
            kp6Var = (kp6) r41Var;
            int i3 = kp6Var.Y;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kp6Var.Y = i3 - Integer.MIN_VALUE;
                Object obj = kp6Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i2 = kp6Var.Y;
                jg7 jg7Var = jg7.a;
                if (i2 == 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return jg7Var;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                if (i > 0) {
                    zg5 zg5Var = (zg5) this.B;
                    if (!zg5Var.A) {
                        zg5Var.A = true;
                        ch6 ch6Var = ch6.START;
                        kp6Var.Y = 1;
                        if (((ne2) this.L).a(ch6Var, kp6Var) == x61Var) {
                            return x61Var;
                        }
                    }
                }
                return jg7Var;
            }
        }
        kp6Var = new kp6(this, r41Var);
        Object obj2 = kp6Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i2 = kp6Var.Y;
        jg7 jg7Var2 = jg7.a;
        if (i2 == 0) {
        }
    }
}
