package defpackage;

import android.net.Uri;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.List;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.EmulatorConfiguration;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ch  reason: default package */
/* loaded from: classes.dex */
public final class ch extends hw6 implements eo2 {
    public String X;
    public File Y;
    public Uri Z;
    public Uri d0;
    public jh e0;
    public long f0;
    public int g0;
    public /* synthetic */ Object h0;
    public final /* synthetic */ pq5 i0;
    public final /* synthetic */ jh j0;
    public final /* synthetic */ List k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch(pq5 pq5Var, jh jhVar, List list, r41 r41Var) {
        super(2, r41Var);
        this.i0 = pq5Var;
        this.j0 = jhVar;
        this.k0 = list;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((ch) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        ch chVar = new ch(this.i0, this.j0, this.k0, r41Var);
        chVar.h0 = obj;
        return chVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c3, code lost:
        if (r5 == r3) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0142 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:13:0x0040, B:41:0x013a, B:43:0x0142, B:45:0x0148, B:75:0x02d3, B:18:0x0051, B:38:0x011f, B:35:0x0109), top: B:82:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e6  */
    @Override // defpackage.d20
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(Object obj) {
        long longValue;
        String B0;
        File file;
        Enum i;
        String str;
        long j;
        Object d;
        Uri fromFile;
        Object g;
        String str2;
        Uri uri;
        jh jhVar;
        EmulatorConfiguration c;
        w61 w61Var = (w61) this.h0;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.g0;
        pq5 pq5Var = this.i0;
        jh jhVar2 = this.j0;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
                                jhVar = this.e0;
                                Uri uri2 = this.d0;
                                fromFile = this.Z;
                                String str3 = this.X;
                                oi2.Y(obj);
                                uri = uri2;
                                str2 = str3;
                                g = obj;
                                Uri uri3 = fromFile;
                                c = jh.c(jhVar, EmulatorConfiguration.copy$default((EmulatorConfiguration) g, true, false, null, null, null, null, null, null, null, null, RecyclerView.B1, RecyclerView.B1, false, 0, 0, false, false, ConsoleType.DSi, false, null, null, 0, null, null, null, null, null, 0L, 134086652, null));
                                jh jhVar3 = this.j0;
                                if (c != null) {
                                    jh.d(jhVar3, this.i0, str2, false, "Failed to prepare DLDI configuration", "Direct loadRom (DSi)");
                                    return new xx5(MelonEmulator.c.NDS_FAILED);
                                }
                                String str4 = str2;
                                jh.b(jhVar3, c);
                                Log.i("AndroidEmulatorManager", "DSiWareShortcut: direct booting title " + str4 + " via loadRom");
                                uri3.getClass();
                                MelonEmulator.b bVar = MelonEmulator.b.NONE;
                                MelonEmulator melonEmulator = MelonEmulator.a;
                                MelonEmulator.c b = melonEmulator.b(uri3, uri, bVar, null, null);
                                if (!b.isTerminal() && g04.H(w61Var)) {
                                    jhVar2.r.c();
                                    if (!jh.a(jhVar2, c)) {
                                        jhVar2.g.a();
                                        melonEmulator.stopEmulation();
                                        jhVar2.r.d();
                                        jhVar2.o.r();
                                        jh.d(this.j0, this.i0, str4, false, "Vulkan pipeline precompilation failed", "Direct loadRom (DSi)");
                                        return new xx5(MelonEmulator.c.NDS_FAILED);
                                    }
                                    melonEmulator.setupCheats((Cheat[]) this.k0.toArray(new Cheat[0]));
                                    melonEmulator.startEmulation(true);
                                    jh.d(this.j0, this.i0, str4, true, "Direct loadRom boot successful in DSi mode (2.1.7 exact pipeline)", "Direct loadRom (DSi)");
                                    return new by5(true);
                                }
                                jhVar2.g.a();
                                melonEmulator.stopEmulation();
                                jhVar2.o.r();
                                jh.d(this.j0, this.i0, str4, false, "Direct loadRom returned terminal error: " + b, "Direct loadRom (DSi)");
                                return new xx5(b);
                            }
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j = this.f0;
                        file = this.Y;
                        String str5 = this.X;
                        oi2.Y(obj);
                        d = obj;
                        str = str5;
                        if (!((Boolean) d).booleanValue() && file.exists() && file.length() != 0) {
                            jhVar2.i.b();
                            fromFile = Uri.fromFile(file);
                            try {
                                Uri a = jhVar2.c.a(pq5Var);
                                this.h0 = w61Var;
                                this.X = str;
                                this.Y = null;
                                this.Z = fromFile;
                                this.d0 = a;
                                this.e0 = jhVar2;
                                this.f0 = j;
                                this.g0 = 4;
                                g = jhVar2.g(pq5Var, this);
                                if (g != x61Var) {
                                    str2 = str;
                                    uri = a;
                                    jhVar = jhVar2;
                                    Uri uri32 = fromFile;
                                    c = jh.c(jhVar, EmulatorConfiguration.copy$default((EmulatorConfiguration) g, true, false, null, null, null, null, null, null, null, null, RecyclerView.B1, RecyclerView.B1, false, 0, 0, false, false, ConsoleType.DSi, false, null, null, 0, null, null, null, null, null, 0L, 134086652, null));
                                    jh jhVar32 = this.j0;
                                    if (c != null) {
                                    }
                                }
                                return x61Var;
                            } catch (qo6 e) {
                                jh.d(this.j0, this.i0, str, false, i61.m("SRAM Load Exception: ", e.getMessage()), "Direct loadRom");
                                return new ay5(e);
                            }
                        }
                        Log.e("AndroidEmulatorManager", "DSiWareShortcut: exportTitleExecutable failed for titleId=" + str);
                        jh.d(this.j0, this.i0, str, false, "exportTitleExecutable failed", "Direct loadRom (DSi)");
                        return new xx5(MelonEmulator.c.NDS_FAILED);
                    }
                    longValue = this.f0;
                    file = this.Y;
                    String str6 = this.X;
                    oi2.Y(obj);
                    str = str6;
                    j = longValue;
                    fg fgVar = jhVar2.i;
                    String absolutePath = file.getAbsolutePath();
                    absolutePath.getClass();
                    this.h0 = w61Var;
                    this.X = str;
                    this.Y = file;
                    this.f0 = j;
                    this.g0 = 3;
                    d = fgVar.d(j, absolutePath, this);
                    if (d == x61Var) {
                        return x61Var;
                    }
                    if (!((Boolean) d).booleanValue()) {
                    }
                    Log.e("AndroidEmulatorManager", "DSiWareShortcut: exportTitleExecutable failed for titleId=" + str);
                    jh.d(this.j0, this.i0, str, false, "exportTitleExecutable failed", "Direct loadRom (DSi)");
                    return new xx5(MelonEmulator.c.NDS_FAILED);
                }
                longValue = this.f0;
                file = this.Y;
                B0 = this.X;
                oi2.Y(obj);
                i = obj;
            } else {
                oi2.Y(obj);
                Long l = pq5Var.l;
                if (l != null) {
                    longValue = l.longValue();
                    jhVar2.getClass();
                    g04.y(16);
                    String l2 = Long.toString(longValue & 4294967295L, 16);
                    l2.getClass();
                    B0 = qs6.B0(8, l2);
                    File file2 = new File(jhVar2.a.getCacheDir(), "dsiware_cache");
                    file2.mkdirs();
                    file = new File(file2, B0 + ".nds");
                    fg fgVar2 = jhVar2.i;
                    this.h0 = w61Var;
                    this.X = B0;
                    this.Y = file;
                    this.f0 = longValue;
                    this.g0 = 1;
                    i = fgVar2.i(this);
                } else {
                    return yx5.a;
                }
            }
            String str7 = B0;
            mm4 mm4Var = (mm4) i;
            if (mm4Var != mm4.SUCCESS && mm4Var != mm4.NAND_ALREADY_OPEN) {
                Log.e("AndroidEmulatorManager", "DSiWareShortcut: failed to open NAND: " + mm4Var);
                jh.d(this.j0, this.i0, str7, false, "Failed to open NAND: " + mm4Var, "Direct loadRom (DSi)");
                return new xx5(MelonEmulator.c.BIOS_FAILED);
            }
            str = str7;
            file.delete();
            fg fgVar3 = jhVar2.i;
            this.h0 = w61Var;
            this.X = str;
            this.Y = file;
            this.f0 = longValue;
            this.g0 = 2;
            if (fgVar3.j(longValue, this) == x61Var) {
                return x61Var;
            }
            j = longValue;
            fg fgVar4 = jhVar2.i;
            String absolutePath2 = file.getAbsolutePath();
            absolutePath2.getClass();
            this.h0 = w61Var;
            this.X = str;
            this.Y = file;
            this.f0 = j;
            this.g0 = 3;
            d = fgVar4.d(j, absolutePath2, this);
            if (d == x61Var) {
            }
            if (!((Boolean) d).booleanValue()) {
            }
            Log.e("AndroidEmulatorManager", "DSiWareShortcut: exportTitleExecutable failed for titleId=" + str);
            jh.d(this.j0, this.i0, str, false, "exportTitleExecutable failed", "Direct loadRom (DSi)");
            return new xx5(MelonEmulator.c.NDS_FAILED);
        } finally {
            jhVar2.i.b();
        }
    }
}
