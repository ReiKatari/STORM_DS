package defpackage;

import android.content.Context;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity;
import me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.FirmwarePreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.GeneralPreferencesFragment;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b5 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ b5(ce0 ce0Var, AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk) {
        this.A = 1;
        this.B = ce0Var;
    }

    private final Object a() {
        return (fi0) ((gi0) this.B).a.get();
    }

    private final Object b() {
        bl0 bl0Var = (bl0) this.B;
        if (bl0Var instanceof yk0) {
            Cheat cheat = ((yk0) bl0Var).b;
            String name = cheat.getName();
            String description = cheat.getDescription();
            if (description == null) {
                description = "";
            }
            return new pl0(name, description, cheat.getCode(), false);
        }
        return new pl0(true);
    }

    private final Object d() {
        ki2 ki2Var = ((tr0) this.B).G0;
        if (ki2Var != null) {
            ki2Var.c();
        }
        return Boolean.TRUE;
    }

    private final Object g() {
        return ((q03) this.B).b(":memory:");
    }

    private final Object k() {
        return new up6((jf4) this.B, RecyclerView.A1);
    }

    private final Object l() {
        return ((hm3) this.B).d();
    }

    private final Object m() {
        CustomFirmwarePreferencesFragment customFirmwarePreferencesFragment = (CustomFirmwarePreferencesFragment) this.B;
        y37 y37Var = customFirmwarePreferencesFragment.d0;
        if (y37Var != null) {
            uf1 uf1Var = customFirmwarePreferencesFragment.e0;
            if (uf1Var != null) {
                return new ns4(customFirmwarePreferencesFragment, y37Var, uf1Var);
            }
            b53.g0("directoryAccessValidator");
            throw null;
        }
        b53.g0("uriPermissionManager");
        throw null;
    }

    private final Object p() {
        int i = DSiWareManagerActivity.A0;
        ((DSiWareManagerActivity) this.B).x();
        return o27.a;
    }

    private final Object r() {
        ((mo6) this.B).close();
        return o27.a;
    }

    private final Object s() {
        od1 a = ((yk1) this.B).a();
        xy6 xy6Var = xk1.a;
        return Float.valueOf(a.C(400.0f));
    }

    private final Object t() {
        FirmwarePreferencesFragment firmwarePreferencesFragment = (FirmwarePreferencesFragment) this.B;
        y37 y37Var = firmwarePreferencesFragment.c0;
        if (y37Var != null) {
            uf1 uf1Var = firmwarePreferencesFragment.d0;
            if (uf1Var != null) {
                return new ns4(firmwarePreferencesFragment, y37Var, uf1Var);
            }
            b53.g0("directoryAccessValidator");
            throw null;
        }
        b53.g0("uriPermissionManager");
        throw null;
    }

    private final Object u() {
        ai2 ai2Var;
        bi2 bi2Var = (bi2) this.B;
        String str = bi2Var.B;
        if (str != null && bi2Var.R) {
            Context context = bi2Var.A;
            context.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            ai2Var = new ai2(bi2Var.A, new File(noBackupFilesDir, str).getAbsolutePath(), new t71(19), bi2Var.L, bi2Var.X);
        } else {
            ai2Var = new ai2(bi2Var.A, bi2Var.B, new t71(19), bi2Var.L, bi2Var.X);
        }
        ai2Var.setWriteAheadLoggingEnabled(bi2Var.Z);
        return ai2Var;
    }

    private final Object v() {
        GeneralPreferencesFragment generalPreferencesFragment = (GeneralPreferencesFragment) this.B;
        y37 y37Var = generalPreferencesFragment.c0;
        if (y37Var != null) {
            uf1 uf1Var = generalPreferencesFragment.d0;
            if (uf1Var != null) {
                return new ns4(generalPreferencesFragment, y37Var, uf1Var);
            }
            b53.g0("directoryAccessValidator");
            throw null;
        }
        b53.g0("uriPermissionManager");
        throw null;
    }

    private final Object w() {
        int i = mo2.a[((no2) this.B).a().ordinal()];
        int i2 = 1;
        if (i != 1) {
            int i3 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i3 = 4;
                    if (i != 4) {
                        if (i != 5) {
                            i.c();
                            return null;
                        }
                    }
                }
                i2 = i3;
            }
        } else {
            i2 = 0;
        }
        return Integer.valueOf(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x0402, code lost:
        if (r8.equalsIgnoreCase("Motorola") != false) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x040c, code lost:
        if ("MotoG3".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0414, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L373;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0416, code lost:
        r8 = android.os.Build.BRAND;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x041f, code lost:
        if (r8.equalsIgnoreCase("Samsung") == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0429, code lost:
        if ("SM-G532F".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0431, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L371;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0433, code lost:
        r8 = android.os.Build.BRAND;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x043c, code lost:
        if (r8.equalsIgnoreCase("Samsung") == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0446, code lost:
        if ("SM-J700F".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x044d, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L369;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x044f, code lost:
        r8 = android.os.Build.BRAND;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0458, code lost:
        if (r8.equalsIgnoreCase("Samsung") == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x0462, code lost:
        if ("SM-A920F".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0469, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L367;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x046b, code lost:
        r8 = android.os.Build.BRAND;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x0474, code lost:
        if (r8.equalsIgnoreCase("Samsung") == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x047e, code lost:
        if ("SM-J415F".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0487, code lost:
        if (r2.equalsIgnoreCase("Xiaomi") != false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0489, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0492, code lost:
        if (r9.equalsIgnoreCase("Xiaomi") == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x049c, code lost:
        if ("Mi A1".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x049e, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x04a0, code lost:
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04a7, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk.class, r8) == false) goto L214;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04a9, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04b7, code lost:
        if (r2.equalsIgnoreCase("Huawei") != false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x04b9, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x04c2, code lost:
        if (r9.equalsIgnoreCase("Huawei") == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x04cc, code lost:
        if ("HUAWEI ALE-L04".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L218;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x04d4, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L360;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x04d6, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x04df, code lost:
        if (r9.equalsIgnoreCase("Samsung") == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04e9, code lost:
        if ("sm-j320f".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x04f1, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x04f3, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x04fc, code lost:
        if (r9.equalsIgnoreCase("Samsung") == false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0506, code lost:
        if ("sm-j700f".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L226;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x050d, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x050f, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0518, code lost:
        if (r9.equalsIgnoreCase("Samsung") == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0522, code lost:
        if ("sm-j111f".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x052b, code lost:
        if (r2.equalsIgnoreCase("Oppo") != false) goto L354;
     */
    /* JADX WARN: Code restructure failed: missing block: B:284:0x052d, code lost:
        r10 = android.os.Build.BRAND;
        r10.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x0536, code lost:
        if (r10.equalsIgnoreCase("Oppo") == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0540, code lost:
        if ("A37F".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L234;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x0547, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x0549, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x0552, code lost:
        if (r9.equalsIgnoreCase("Samsung") == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x055c, code lost:
        if ("sm-j510fn".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x055e, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0560, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0567, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk.class, r9) == false) goto L242;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0569, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0575, code lost:
        if (r2.equalsIgnoreCase("Huawei") != false) goto L350;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0577, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0580, code lost:
        if (r9.equalsIgnoreCase("Huawei") == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0583, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0585, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x058c, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.class, r9) == false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x058e, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x059a, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L347;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x059c, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x05a5, code lost:
        if (r9.equalsIgnoreCase("Samsung") == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x05a7, code lost:
        defpackage.ce0.g.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x05b0, code lost:
        if (defpackage.be0.c(r3) == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05b2, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x05b4, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x05bb, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class, r9) == false) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x05bd, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x05c9, code lost:
        if (defpackage.yf2.A() != false) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x05cf, code lost:
        if (defpackage.yf2.C() != false) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x05d5, code lost:
        if (defpackage.yf2.F() != false) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x05db, code lost:
        if (defpackage.yf2.D() != false) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x05dd, code lost:
        r9 = android.os.Build.MODEL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x05e5, code lost:
        if ("pixel 4 xl".equalsIgnoreCase(r9) == false) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x05eb, code lost:
        if (android.os.Build.VERSION.SDK_INT != 29) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x05f2, code lost:
        if (r2.equalsIgnoreCase("Motorola") != false) goto L344;
     */
    /* JADX WARN: Code restructure failed: missing block: B:336:0x05f4, code lost:
        r10 = android.os.Build.BRAND;
        r10.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x05fd, code lost:
        if (r10.equalsIgnoreCase("Motorola") == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x0605, code lost:
        if ("moto e13".equalsIgnoreCase(r9) == false) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x060c, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L340;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x060e, code lost:
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0617, code lost:
        if (r6.equalsIgnoreCase("Samsung") == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0619, code lost:
        r6 = android.os.Build.DEVICE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0621, code lost:
        if ("gta8".equalsIgnoreCase(r6) != false) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0629, code lost:
        if ("gta8wifi".equalsIgnoreCase(r6) == false) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0630, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0632, code lost:
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:353:0x063b, code lost:
        if (r6.equalsIgnoreCase("Samsung") == false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x063d, code lost:
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x0646, code lost:
        if (defpackage.gh6.n0(r9, "SM-A536", false) == false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x064d, code lost:
        if (defpackage.a53.N() == false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x0650, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0652, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x0659, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, r4) == false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x065b, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0663, code lost:
        r4 = android.os.Build.MODEL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x066b, code lost:
        if ("Pixel 8".equalsIgnoreCase(r4) == false) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x066d, code lost:
        r6 = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
        r6.getClass();
        r6 = (java.lang.Integer) ((defpackage.ia0) r3).c(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x067b, code lost:
        if (r6 != null) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x0682, code lost:
        if (r6.intValue() != 0) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x0684, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0686, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x068d, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.TemporalNoiseQuirk.class, r6) == false) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x068f, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0697, code lost:
        r6 = androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.a;
        r4.getClass();
        r9 = r4.toLowerCase(java.util.Locale.ROOT);
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x06a9, code lost:
        if (r6.contains(r9) != false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x06af, code lost:
        if (defpackage.a53.N() != false) goto L336;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x06b5, code lost:
        if (r2.equalsIgnoreCase("Huawei") != false) goto L334;
     */
    /* JADX WARN: Code restructure failed: missing block: B:383:0x06b7, code lost:
        r2 = android.os.Build.BRAND;
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x06c0, code lost:
        if (r2.equalsIgnoreCase("Huawei") == false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x06c8, code lost:
        if ("FIG-LX1".equalsIgnoreCase(r4) == false) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x06cb, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x06cd, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x06d4, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.class, r2) == false) goto L310;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x06d6, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x06e8, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, defpackage.b53.T()) == false) goto L313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x06ea, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x06f2, code lost:
        r2 = androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x06f4, code lost:
        if (r2 == null) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x06fa, code lost:
        if (r2.isEmpty() == false) goto L322;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x06fd, code lost:
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0705, code lost:
        if (r2.hasNext() == false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x0707, code lost:
        r6 = android.os.Build.MODEL;
        r6.getClass();
        r6 = r6.toLowerCase(java.util.Locale.ROOT);
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x071f, code lost:
        if (defpackage.gh6.n0(r6, (java.lang.String) r2.next(), false) == false) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0721, code lost:
        r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
        r2.getClass();
        r2 = (java.lang.Integer) ((defpackage.ia0) r3).c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x072e, code lost:
        if (r2 != null) goto L330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x0735, code lost:
        if (r2.intValue() != 1) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0737, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x073e, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk.class, r5) == false) goto L320;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0740, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0748, code lost:
        r0 = new defpackage.ox4(r1);
        defpackage.ve2.v("CameraQuirks", "camera2 CameraQuirks = ".concat(defpackage.ox4.d(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x075c, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:445:0x0800, code lost:
        if (defpackage.f32.a.contains(r10) != false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ed, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L388;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0294 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:654:0x020b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:656:0x03db A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a0  */
    @Override // defpackage.ki2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c() {
        /*
            Method dump skipped, instructions count: 2974
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b5.c():java.lang.Object");
    }

    public /* synthetic */ b5(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }
}
