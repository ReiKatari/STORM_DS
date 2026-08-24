package defpackage;

import android.net.Uri;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.concurrent.CancellationException;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
import me.magnum.melonds.impl.emulator.EmulatorMessageQueue;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dh  reason: default package */
/* loaded from: classes.dex */
public final class dh extends hw6 implements eo2 {
    public Uri X;
    public Uri Y;
    public jh Z;
    public int d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ pq5 f0;
    public final /* synthetic */ jh g0;
    public final /* synthetic */ List h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh(pq5 pq5Var, jh jhVar, List list, r41 r41Var) {
        super(2, r41Var);
        this.f0 = pq5Var;
        this.g0 = jhVar;
        this.h0 = list;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((dh) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        dh dhVar = new dh(this.f0, this.g0, this.h0, r41Var);
        dhVar.e0 = obj;
        return dhVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0275 A[Catch: all -> 0x017b, TryCatch #3 {all -> 0x017b, blocks: (B:80:0x0163, B:82:0x016f, B:123:0x026f, B:125:0x0275, B:128:0x027d, B:130:0x0286, B:133:0x02a5, B:135:0x02ad, B:138:0x02e3, B:142:0x02ec, B:144:0x02f0, B:147:0x0318, B:88:0x017e, B:90:0x0186, B:92:0x01ec, B:95:0x01f3, B:97:0x01f7, B:99:0x01fb, B:102:0x0201, B:104:0x020d, B:106:0x0217, B:108:0x021d, B:110:0x0226, B:112:0x023a, B:115:0x025d, B:119:0x0266, B:149:0x031e, B:150:0x0325, B:154:0x032f, B:152:0x0327, B:157:0x0335, B:35:0x0090), top: B:168:0x001f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0286 A[Catch: all -> 0x017b, TRY_LEAVE, TryCatch #3 {all -> 0x017b, blocks: (B:80:0x0163, B:82:0x016f, B:123:0x026f, B:125:0x0275, B:128:0x027d, B:130:0x0286, B:133:0x02a5, B:135:0x02ad, B:138:0x02e3, B:142:0x02ec, B:144:0x02f0, B:147:0x0318, B:88:0x017e, B:90:0x0186, B:92:0x01ec, B:95:0x01f3, B:97:0x01f7, B:99:0x01fb, B:102:0x0201, B:104:0x020d, B:106:0x0217, B:108:0x021d, B:110:0x0226, B:112:0x023a, B:115:0x025d, B:119:0x0266, B:149:0x031e, B:150:0x0325, B:154:0x032f, B:152:0x0327, B:157:0x0335, B:35:0x0090), top: B:168:0x001f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ad A[Catch: all -> 0x017b, TRY_LEAVE, TryCatch #3 {all -> 0x017b, blocks: (B:80:0x0163, B:82:0x016f, B:123:0x026f, B:125:0x0275, B:128:0x027d, B:130:0x0286, B:133:0x02a5, B:135:0x02ad, B:138:0x02e3, B:142:0x02ec, B:144:0x02f0, B:147:0x0318, B:88:0x017e, B:90:0x0186, B:92:0x01ec, B:95:0x01f3, B:97:0x01f7, B:99:0x01fb, B:102:0x0201, B:104:0x020d, B:106:0x0217, B:108:0x021d, B:110:0x0226, B:112:0x023a, B:115:0x025d, B:119:0x0266, B:149:0x031e, B:150:0x0325, B:154:0x032f, B:152:0x0327, B:157:0x0335, B:35:0x0090), top: B:168:0x001f, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b5 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:9:0x002e, B:40:0x00ad, B:42:0x00b5, B:44:0x00bd, B:46:0x00dc, B:60:0x0109, B:48:0x00e1, B:50:0x00e5, B:51:0x00e8, B:53:0x00f0, B:54:0x00f3, B:56:0x00fb, B:57:0x00fe, B:59:0x0106, B:15:0x0043, B:32:0x0087, B:35:0x0090, B:36:0x0096, B:16:0x0049, B:19:0x0050, B:22:0x0058, B:24:0x005c, B:27:0x006d, B:29:0x007b), top: B:168:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bd A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:9:0x002e, B:40:0x00ad, B:42:0x00b5, B:44:0x00bd, B:46:0x00dc, B:60:0x0109, B:48:0x00e1, B:50:0x00e5, B:51:0x00e8, B:53:0x00f0, B:54:0x00f3, B:56:0x00fb, B:57:0x00fe, B:59:0x0106, B:15:0x0043, B:32:0x0087, B:35:0x0090, B:36:0x0096, B:16:0x0049, B:19:0x0050, B:22:0x0058, B:24:0x005c, B:27:0x006d, B:29:0x007b), top: B:168:0x001f }] */
    /* JADX WARN: Type inference failed for: r7v0, types: [int] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v54 */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        jh jhVar;
        pq5 pq5Var;
        jh jhVar2;
        pq5 pq5Var2;
        Object obj2;
        Object g;
        Uri uri;
        Uri uri2;
        jh jhVar3;
        EmulatorConfiguration c;
        MelonEmulator.b bVar;
        sw5 sw5Var;
        Uri uri3;
        sw5 sw5Var2;
        g91 g91Var;
        Uri uri4;
        p87 p87Var;
        pq5 pq5Var3;
        MelonEmulator.b bVar2;
        EmulatorConfiguration emulatorConfiguration;
        sw5 sw5Var3;
        Uri uri5;
        sw5 sw5Var4;
        MelonEmulator.c cVar;
        Uri uri6;
        Uri uri7;
        boolean z;
        boolean z2;
        String str = "loadRom: rom='";
        w61 w61Var = (w61) this.e0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        ?? r7 = this.d0;
        MelonEmulator melonEmulator = MelonEmulator.a;
        List list = this.h0;
        pq5 pq5Var4 = this.f0;
        jh jhVar4 = this.g0;
        try {
            try {
                if (r7 != 0) {
                    if (r7 != 1) {
                        if (r7 != 2) {
                            if (r7 == 3) {
                                jhVar3 = this.Z;
                                Uri uri8 = this.Y;
                                Uri uri9 = this.X;
                                oi2.Y(obj);
                                uri = uri8;
                                uri2 = uri9;
                                g = obj;
                                c = jh.c(jhVar3, (EmulatorConfiguration) g);
                                if (c != null) {
                                    return new xx5(MelonEmulator.c.NDS_FAILED);
                                }
                                jh.b(jhVar4, c);
                                p87 p87Var2 = jhVar4.o;
                                g91 g91Var2 = jhVar4.g;
                                EmulatorMessageQueue emulatorMessageQueue = jhVar4.r;
                                jt5 jt5Var = pq5Var4.f;
                                String str2 = pq5Var4.a;
                                hi2 hi2Var = jt5Var.d;
                                Uri uri10 = uri2;
                                if (nb3.k(hi2Var, uw5.o)) {
                                    bVar = MelonEmulator.b.NONE;
                                } else if (hi2Var instanceof sw5) {
                                    bVar = MelonEmulator.b.GBA_ROM;
                                } else if (nb3.k(hi2Var, tw5.o)) {
                                    bVar = MelonEmulator.b.MEMORY_EXPANSION;
                                } else if (nb3.k(hi2Var, vw5.o)) {
                                    bVar = MelonEmulator.b.RUMBLE_PAK;
                                } else if (nb3.k(hi2Var, rw5.o)) {
                                    bVar = MelonEmulator.b.ANALOG_INPUT;
                                } else {
                                    throw new RuntimeException();
                                }
                                MelonEmulator.b bVar3 = bVar;
                                try {
                                    Log.w("AndroidEmulatorManager", "loadRom: rom='" + str2 + "' gbaSlotType=" + bVar3.name());
                                    if (hi2Var instanceof sw5) {
                                        sw5Var = (sw5) hi2Var;
                                    } else {
                                        sw5Var = null;
                                    }
                                    if (sw5Var != null) {
                                        uri3 = sw5Var.o;
                                    } else {
                                        uri3 = null;
                                    }
                                    if (hi2Var instanceof sw5) {
                                        sw5Var2 = (sw5) hi2Var;
                                    } else {
                                        sw5Var2 = null;
                                    }
                                    if (sw5Var2 != null) {
                                        g91Var = g91Var2;
                                        uri4 = sw5Var2.p;
                                        p87Var = p87Var2;
                                        bVar2 = bVar3;
                                        melonEmulator = melonEmulator;
                                        pq5Var3 = pq5Var4;
                                    } else {
                                        g91Var = g91Var2;
                                        uri4 = null;
                                        p87Var = p87Var2;
                                        pq5Var3 = pq5Var4;
                                        bVar2 = bVar3;
                                        melonEmulator = melonEmulator;
                                    }
                                    Uri uri11 = uri3;
                                    jh jhVar5 = jhVar4;
                                    MelonEmulator.c b = melonEmulator.b(uri10, uri, bVar2, uri11, uri4);
                                    try {
                                        if (!b.isTerminal()) {
                                            if (!g04.H(w61Var)) {
                                            }
                                            cVar = b;
                                            emulatorConfiguration = c;
                                            if (!cVar.isTerminal() && g04.H(w61Var)) {
                                                emulatorMessageQueue.c();
                                                if (jh.a(jhVar5, emulatorConfiguration)) {
                                                    g91Var.a();
                                                    melonEmulator.stopEmulation();
                                                    emulatorMessageQueue.d();
                                                    p87Var.r();
                                                    jh.d(this.g0, pq5Var3, pq5Var3.c, false, "Vulkan pipeline precompilation failed", "loadRom");
                                                    return new xx5(MelonEmulator.c.NDS_FAILED);
                                                }
                                                melonEmulator.setupCheats((Cheat[]) list.toArray(new Cheat[0]));
                                                melonEmulator.startEmulation(true);
                                                jh.d(this.g0, pq5Var3, pq5Var3.c, true, "ROM launch successful in " + emulatorConfiguration.getConsoleType() + " mode", "loadRom");
                                                if (cVar != MelonEmulator.c.SUCCESS_GBA_FAILED) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                return new by5(z2);
                                            }
                                            g91Var.a();
                                            melonEmulator.stopEmulation();
                                            p87Var.r();
                                            jh.d(this.g0, pq5Var3, pq5Var3.c, false, "loadRom returned terminal error: " + cVar, "loadRom");
                                            return new xx5(cVar);
                                        }
                                        if (c.getConsoleType() == ConsoleType.DSi) {
                                            Log.w("AndroidEmulatorManager", "Loading ROM '" + str2 + "' in DSi mode failed (" + b + "), attempting fallback in DS mode");
                                            EmulatorConfiguration copy$default = EmulatorConfiguration.copy$default(c, false, false, null, null, null, null, null, null, null, null, RecyclerView.B1, RecyclerView.B1, false, 0, 0, false, false, ConsoleType.DS, false, null, null, 0, null, null, null, null, null, 0L, 268304380, null);
                                            emulatorConfiguration = c;
                                            jh.b(jhVar5, copy$default);
                                            if (hi2Var instanceof sw5) {
                                                sw5Var3 = (sw5) hi2Var;
                                            } else {
                                                sw5Var3 = null;
                                            }
                                            if (sw5Var3 != null) {
                                                uri5 = sw5Var3.o;
                                            } else {
                                                uri5 = null;
                                            }
                                            if (hi2Var instanceof sw5) {
                                                sw5Var4 = (sw5) hi2Var;
                                            } else {
                                                sw5Var4 = null;
                                            }
                                            if (sw5Var4 != null) {
                                                Uri uri12 = uri5;
                                                uri7 = sw5Var4.p;
                                                cVar = b;
                                                uri6 = uri12;
                                            } else {
                                                cVar = b;
                                                uri6 = uri5;
                                                uri7 = null;
                                            }
                                            MelonEmulator.c b2 = melonEmulator.b(uri10, uri, bVar2, uri6, uri7);
                                            if (!b2.isTerminal() && g04.H(w61Var)) {
                                                emulatorMessageQueue.c();
                                                if (!jh.a(jhVar5, copy$default)) {
                                                    g91Var.a();
                                                    melonEmulator.stopEmulation();
                                                    emulatorMessageQueue.d();
                                                    p87Var.r();
                                                    return new xx5(MelonEmulator.c.NDS_FAILED);
                                                }
                                                melonEmulator.setupCheats((Cheat[]) list.toArray(new Cheat[0]));
                                                melonEmulator.startEmulation(true);
                                                jh.d(this.g0, pq5Var3, pq5Var3.c, true, "Fallback boot successful in standard DS FreeBIOS mode", "loadRom (DS Fallback)");
                                                if (b2 != MelonEmulator.c.SUCCESS_GBA_FAILED) {
                                                    z = true;
                                                } else {
                                                    z = false;
                                                }
                                                return new by5(z);
                                            }
                                            if (!cVar.isTerminal()) {
                                                emulatorMessageQueue.c();
                                                if (jh.a(jhVar5, emulatorConfiguration)) {
                                                }
                                            }
                                            g91Var.a();
                                            melonEmulator.stopEmulation();
                                            p87Var.r();
                                            jh.d(this.g0, pq5Var3, pq5Var3.c, false, "loadRom returned terminal error: " + cVar, "loadRom");
                                            return new xx5(cVar);
                                        }
                                        cVar = b;
                                        emulatorConfiguration = c;
                                        if (!cVar.isTerminal()) {
                                        }
                                        g91Var.a();
                                        melonEmulator.stopEmulation();
                                        p87Var.r();
                                        jh.d(this.g0, pq5Var3, pq5Var3.c, false, "loadRom returned terminal error: " + cVar, "loadRom");
                                        return new xx5(cVar);
                                    } catch (Throwable th) {
                                        th = th;
                                        pq5Var = p87Var;
                                        jhVar = jhVar5;
                                        if (th instanceof CancellationException) {
                                            Log.e("AndroidEmulatorManager", "Failed to load ROM '" + pq5Var.a + "'", th);
                                            jhVar.g.a();
                                            melonEmulator.stopEmulation();
                                            jhVar.r.d();
                                            jhVar.o.r();
                                            jh.d(this.g0, pq5Var, pq5Var.c, false, i61.m("Exception during launch: ", th.getMessage()), "loadRom Exception");
                                            return new xx5(MelonEmulator.c.NDS_FAILED);
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    jhVar = jhVar4;
                                    pq5Var = pq5Var4;
                                    melonEmulator = melonEmulator;
                                }
                            } else {
                                i.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                        } else {
                            oi2.Y(obj);
                            r7 = obj;
                        }
                    } else {
                        oi2.Y(obj);
                        return obj;
                    }
                } else {
                    oi2.Y(obj);
                    boolean c2 = pq5Var4.c();
                    Uri uri13 = pq5Var4.d;
                    if (!c2 && pq5Var4.l == null) {
                        if (nb3.k(uri13.getScheme(), "dsiware-installed")) {
                            jhVar2 = jhVar4;
                            pq5Var2 = pq5Var4;
                            obj2 = null;
                        } else {
                            pw5 a = jhVar4.e.a(zl1.g(jhVar4.a, uri13));
                            if (a != null) {
                                this.e0 = w61Var;
                                this.d0 = 2;
                                Object b3 = a.b(pq5Var4, this);
                                r7 = b3;
                                if (b3 == x61Var) {
                                    return x61Var;
                                }
                            }
                            return zx5.a;
                        }
                    } else {
                        jhVar2 = jhVar4;
                        pq5Var2 = pq5Var4;
                        obj2 = null;
                    }
                    this.e0 = obj2;
                    this.d0 = 1;
                    jhVar2.getClass();
                    xe1 xe1Var = xk1.a;
                    Object d0 = hv.d0(de1.L, new ch(pq5Var2, jhVar2, list, null), this);
                    if (d0 == x61Var) {
                        return x61Var;
                    }
                    return d0;
                }
                Uri uri14 = r7;
                if (uri14 != null) {
                    try {
                        Uri a2 = jhVar4.c.a(pq5Var4);
                        this.e0 = w61Var;
                        this.X = uri14;
                        this.Y = a2;
                        this.Z = jhVar4;
                        this.d0 = 3;
                        g = jhVar4.g(pq5Var4, this);
                        if (g != x61Var) {
                            uri = a2;
                            uri2 = uri14;
                            jhVar3 = jhVar4;
                            c = jh.c(jhVar3, (EmulatorConfiguration) g);
                            if (c != null) {
                            }
                        } else {
                            return x61Var;
                        }
                    } catch (qo6 e) {
                        return new ay5(e);
                    }
                }
                return zx5.a;
            } catch (Throwable th3) {
                th = th3;
                jhVar = jhVar4;
                pq5Var = pq5Var4;
            }
        } catch (Throwable th4) {
            th = th4;
            jhVar = str;
            pq5Var = r7;
            if (th instanceof CancellationException) {
            }
        }
    }
}
