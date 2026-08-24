package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.AeFpsRangeLegacyQuirk;
import androidx.camera.camera2.compat.quirk.AfRegionFlipHorizontallyQuirk;
import androidx.camera.camera2.compat.quirk.AspectRatioLegacyApi21Quirk;
import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.compat.quirk.CameraNoResponseWhenEnablingFlashQuirk;
import androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.compat.quirk.CloseCaptureSessionOnVideoQuirk;
import androidx.camera.camera2.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk;
import androidx.camera.camera2.compat.quirk.FlashTooSlowQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailWithAutoFlashQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFlashNotFireQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureWashedOutImageQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureWithFlashUnderexposureQuirk;
import androidx.camera.camera2.compat.quirk.JpegCaptureDownsizingQuirk;
import androidx.camera.camera2.compat.quirk.JpegHalCorruptImageQuirk;
import androidx.camera.camera2.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.ui.backgrounds.BackgroundsActivity;
import me.magnum.melonds.ui.dldi.DldiFileManagerActivity;
import me.magnum.melonds.ui.dsiwaremanager.DSiWareManagerActivity;
import me.magnum.melonds.ui.settings.fragments.CustomFirmwarePreferencesFragment;
import me.magnum.melonds.ui.settings.fragments.FirmwarePreferencesFragment;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class a5 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ a5(lg0 lg0Var, AeFpsRangeLegacyQuirk aeFpsRangeLegacyQuirk) {
        this.A = 1;
        this.B = lg0Var;
    }

    private final Object a() {
        jn0 jn0Var = (jn0) this.B;
        if (jn0Var instanceof gn0) {
            Cheat cheat = ((gn0) jn0Var).b;
            String name = cheat.getName();
            String description = cheat.getDescription();
            if (description == null) {
                description = "";
            }
            return new xn0(name, description, cheat.getCode(), false);
        }
        return new xn0(true);
    }

    private final Object b() {
        on2 on2Var = ((gu0) this.B).H0;
        if (on2Var != null) {
            on2Var.c();
        }
        return Boolean.TRUE;
    }

    private final Object f() {
        return new i27((lo4) this.B, RecyclerView.B1);
    }

    private final Object h() {
        CustomFirmwarePreferencesFragment customFirmwarePreferencesFragment = (CustomFirmwarePreferencesFragment) this.B;
        wh7 wh7Var = customFirmwarePreferencesFragment.e0;
        if (wh7Var != null) {
            yj1 yj1Var = customFirmwarePreferencesFragment.f0;
            if (yj1Var != null) {
                return new p15(customFirmwarePreferencesFragment, wh7Var, yj1Var);
            }
            nb3.a0("directoryAccessValidator");
            throw null;
        }
        nb3.a0("uriPermissionManager");
        throw null;
    }

    private final Object i() {
        int i = DSiWareManagerActivity.B0;
        ((DSiWareManagerActivity) this.B).x();
        return jg7.a;
    }

    private final Object j() {
        return ((db1) this.B).a.getSharedPreferences("dsiware_titles_meta", 0);
    }

    private final Object k() {
        ((x07) this.B).close();
        return jg7.a;
    }

    private final Object q() {
        int i = DldiFileManagerActivity.r0;
        ((DldiFileManagerActivity) this.B).finish();
        return jg7.a;
    }

    private final Object r() {
        qh1 a = ((ep1) this.B).a();
        sc7 sc7Var = dp1.a;
        return Float.valueOf(a.e0(400.0f));
    }

    private final Object s() {
        FirmwarePreferencesFragment firmwarePreferencesFragment = (FirmwarePreferencesFragment) this.B;
        wh7 wh7Var = firmwarePreferencesFragment.d0;
        if (wh7Var != null) {
            yj1 yj1Var = firmwarePreferencesFragment.e0;
            if (yj1Var != null) {
                return new p15(firmwarePreferencesFragment, wh7Var, yj1Var);
            }
            nb3.a0("directoryAccessValidator");
            throw null;
        }
        nb3.a0("uriPermissionManager");
        throw null;
    }

    private final Object t() {
        an2 an2Var;
        bn2 bn2Var = (bn2) this.B;
        String str = bn2Var.B;
        if (str != null && bn2Var.R) {
            Context context = bn2Var.A;
            context.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            an2Var = new an2(bn2Var.A, new File(noBackupFilesDir, str).getAbsolutePath(), new d51(21), bn2Var.L, bn2Var.X);
        } else {
            an2Var = new an2(bn2Var.A, bn2Var.B, new d51(21), bn2Var.L, bn2Var.X);
        }
        an2Var.setWriteAheadLoggingEnabled(bn2Var.Z);
        return an2Var;
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:686)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:544)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:79)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:257)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:241)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:132)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:95)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:115)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:383)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:331)
        */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x0401, code lost:
        if (r8.equalsIgnoreCase("Motorola") != false) goto L370;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x040b, code lost:
        if ("MotoG3".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0413, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L368;
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x0415, code lost:
        r8 = android.os.Build.BRAND;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x041e, code lost:
        if (r8.equalsIgnoreCase("Samsung") == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0428, code lost:
        if ("SM-G532F".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0430, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L366;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0432, code lost:
        r8 = android.os.Build.BRAND;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x043b, code lost:
        if (r8.equalsIgnoreCase("Samsung") == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0445, code lost:
        if ("SM-J700F".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x044c, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L364;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x044e, code lost:
        r8 = android.os.Build.BRAND;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0457, code lost:
        if (r8.equalsIgnoreCase("Samsung") == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0461, code lost:
        if ("SM-A920F".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0468, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x046a, code lost:
        r8 = android.os.Build.BRAND;
        r8.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0473, code lost:
        if (r8.equalsIgnoreCase("Samsung") == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x047d, code lost:
        if ("SM-J415F".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0486, code lost:
        if (r2.equalsIgnoreCase("Xiaomi") != false) goto L359;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0488, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0491, code lost:
        if (r9.equalsIgnoreCase("Xiaomi") == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x049b, code lost:
        if ("Mi A1".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x049d, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x049f, code lost:
        r8 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x04a6, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.YuvImageOnePixelShiftQuirk.class, r8) == false) goto L209;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x04a8, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x04b6, code lost:
        if (r2.equalsIgnoreCase("Huawei") != false) goto L357;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x04b8, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x04c1, code lost:
        if (r9.equalsIgnoreCase("Huawei") == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x04cb, code lost:
        if ("HUAWEI ALE-L04".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L213;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x04d3, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L355;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x04d5, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x04de, code lost:
        if (r9.equalsIgnoreCase("Samsung") == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x04e8, code lost:
        if ("sm-j320f".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L217;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x04f0, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L353;
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x04f2, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x04fb, code lost:
        if (r9.equalsIgnoreCase("Samsung") == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0505, code lost:
        if ("sm-j700f".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x050c, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L351;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x050e, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0517, code lost:
        if (r9.equalsIgnoreCase("Samsung") == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0521, code lost:
        if ("sm-j111f".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x052a, code lost:
        if (r2.equalsIgnoreCase("Oppo") != false) goto L349;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x052c, code lost:
        r10 = android.os.Build.BRAND;
        r10.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0535, code lost:
        if (r10.equalsIgnoreCase("Oppo") == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x053f, code lost:
        if ("A37F".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L229;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0546, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L346;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0548, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0551, code lost:
        if (r9.equalsIgnoreCase("Samsung") == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x055b, code lost:
        if ("sm-j510fn".equalsIgnoreCase(android.os.Build.MODEL) == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x055d, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x055f, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0566, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.PreviewStretchWhenVideoCaptureIsBoundQuirk.class, r9) == false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0568, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0574, code lost:
        if (r2.equalsIgnoreCase("Huawei") != false) goto L345;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0576, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x057f, code lost:
        if (r9.equalsIgnoreCase("Huawei") == false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x0582, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0584, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x058b, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.PreviewDelayWhenVideoCaptureIsBoundQuirk.class, r9) == false) goto L245;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x058d, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0599, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L342;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x059b, code lost:
        r9 = android.os.Build.BRAND;
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x05a4, code lost:
        if (r9.equalsIgnoreCase("Samsung") == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x05a6, code lost:
        defpackage.lg0.g.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x05af, code lost:
        if (defpackage.kg0.c(r4) == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x05b1, code lost:
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x05b3, code lost:
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x05ba, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class, r9) == false) goto L253;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x05bc, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x05c8, code lost:
        if (defpackage.xk2.x() != false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x05ce, code lost:
        if (defpackage.xk2.y() != false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x05d4, code lost:
        if (defpackage.xk2.A() != false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x05da, code lost:
        if (defpackage.xk2.z() != false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x05dc, code lost:
        r9 = android.os.Build.MODEL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x05e4, code lost:
        if ("pixel 4 xl".equalsIgnoreCase(r9) == false) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x05ea, code lost:
        if (android.os.Build.VERSION.SDK_INT != 29) goto L265;
     */
    /* JADX WARN: Code restructure failed: missing block: B:331:0x05f1, code lost:
        if (r2.equalsIgnoreCase("Motorola") != false) goto L339;
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x05f3, code lost:
        r10 = android.os.Build.BRAND;
        r10.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x05fc, code lost:
        if (r10.equalsIgnoreCase("Motorola") == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:0x0604, code lost:
        if ("moto e13".equalsIgnoreCase(r9) == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x060b, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x060d, code lost:
        r7 = android.os.Build.BRAND;
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0616, code lost:
        if (r7.equalsIgnoreCase("Samsung") == false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x0618, code lost:
        r7 = android.os.Build.DEVICE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x0620, code lost:
        if ("gta8".equalsIgnoreCase(r7) != false) goto L341;
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x0628, code lost:
        if ("gta8wifi".equalsIgnoreCase(r7) == false) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x062f, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L333;
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x0631, code lost:
        r7 = android.os.Build.BRAND;
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x063a, code lost:
        if (r7.equalsIgnoreCase("Samsung") == false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x063c, code lost:
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0645, code lost:
        if (defpackage.xs6.g0(r9, "SM-A536", false) == false) goto L277;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x064c, code lost:
        if (defpackage.lb4.C() == false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x064f, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x0651, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x0658, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.ImageCaptureFailedWhenVideoCaptureIsBoundQuirk.class, r5) == false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x065a, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x0662, code lost:
        r5 = android.os.Build.MODEL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x066a, code lost:
        if ("Pixel 8".equalsIgnoreCase(r5) == false) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x066c, code lost:
        r7 = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
        r7.getClass();
        r7 = (java.lang.Integer) ((defpackage.qc0) r4).c(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x067a, code lost:
        if (r7 != null) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x0681, code lost:
        if (r7.intValue() != 0) goto L332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0683, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:369:0x0685, code lost:
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:371:0x068c, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.TemporalNoiseQuirk.class, r7) == false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x068e, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0696, code lost:
        r7 = androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.a;
        r5.getClass();
        r9 = r5.toLowerCase(java.util.Locale.ROOT);
        r9.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x06a8, code lost:
        if (r7.contains(r9) != false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:376:0x06ae, code lost:
        if (defpackage.lb4.C() != false) goto L331;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x06b4, code lost:
        if (r2.equalsIgnoreCase("Huawei") != false) goto L329;
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x06b6, code lost:
        r2 = android.os.Build.BRAND;
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x06bf, code lost:
        if (r2.equalsIgnoreCase("Huawei") == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x06c7, code lost:
        if ("FIG-LX1".equalsIgnoreCase(r5) == false) goto L301;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x06ca, code lost:
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:385:0x06cc, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:387:0x06d3, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk.class, r2) == false) goto L305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x06d5, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:390:0x06e7, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.AbnormalStreamWhenImageAnalysisBindWithTemplateRecordQuirk.class, defpackage.ge7.J()) == false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x06e9, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x06f1, code lost:
        r2 = androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x06f3, code lost:
        if (r2 == null) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x06f9, code lost:
        if (r2.isEmpty() == false) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x06fc, code lost:
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x0704, code lost:
        if (r2.hasNext() == false) goto L328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x0706, code lost:
        r7 = android.os.Build.MODEL;
        r7.getClass();
        r7 = r7.toLowerCase(java.util.Locale.ROOT);
        r7.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x071e, code lost:
        if (defpackage.xs6.g0(r7, (java.lang.String) r2.next(), false) == false) goto L318;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0720, code lost:
        r2 = android.hardware.camera2.CameraCharacteristics.LENS_FACING;
        r2.getClass();
        r2 = (java.lang.Integer) ((defpackage.qc0) r4).c(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x072d, code lost:
        if (r2 != null) goto L325;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x0734, code lost:
        if (r2.intValue() != 1) goto L312;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0736, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x073d, code lost:
        if (r0.a(androidx.camera.camera2.compat.quirk.UltraWideFlashCaptureUnderexposureQuirk.class, r3) == false) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x073f, code lost:
        r1.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0747, code lost:
        r0 = new defpackage.y65(r1);
        defpackage.kj2.t("CameraQuirks", "camera2 CameraQuirks = ".concat(defpackage.y65.d(r0)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x075b, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0800, code lost:
        if (defpackage.x72.a.contains(r9) != false) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ec, code lost:
        if (r2.equalsIgnoreCase("Samsung") != false) goto L383;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0293 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:647:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:649:0x03da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c3  */
    @Override // defpackage.on2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object c() {
        /*
            Method dump skipped, instructions count: 2976
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a5.c():java.lang.Object");
    }

    public /* synthetic */ a5(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }
}
