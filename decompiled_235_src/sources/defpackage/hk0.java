package defpackage;

import android.os.Build;
import android.util.Pair;
import androidx.camera.camera2.compat.quirk.CloseCameraDeviceOnCameraGraphCloseQuirk;
import androidx.camera.camera2.compat.quirk.CrashWhenTakingPhotoWithAutoFlashAEModeQuirk;
import androidx.camera.camera2.compat.quirk.PixelJpegRSupportedQuirk;
import androidx.camera.core.internal.compat.quirk.BackportedFixQuirk;
import androidx.camera.core.internal.compat.quirk.CaptureFailedRetryQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk;
import androidx.camera.core.internal.compat.quirk.LargeJpegImageQuirk;
import androidx.camera.core.internal.compat.quirk.LowMemoryQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hk0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hk0 implements b31 {
    public final /* synthetic */ int a;

    public /* synthetic */ hk0(int i) {
        this.a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01a7, code lost:
        if (r10.equalsIgnoreCase("Tecno") == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01b0, code lost:
        if (r7.equalsIgnoreCase("Tecno-mobile") != false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b6, code lost:
        if (r10.equalsIgnoreCase("Tecno-mobile") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bb, code lost:
        if (androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.a != false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01bf, code lost:
        if (androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.b == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c2, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01c4, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01cb, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.class, r5) == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cd, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01db, code lost:
        if (r7.equalsIgnoreCase("Samsung") != false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01dd, code lost:
        r5 = android.os.Build.BRAND;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01e6, code lost:
        if (r5.equalsIgnoreCase("Samsung") == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ed, code lost:
        if (r7.equalsIgnoreCase("Xiaomi") != false) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01f3, code lost:
        if (r5.equalsIgnoreCase("Xiaomi") == false) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01f6, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01f8, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01ff, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk.class, r5) == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0201, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0209, code lost:
        r5 = androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.a;
        r12 = java.util.Locale.US;
        r12.getClass();
        r13 = r7.toLowerCase(r12);
        r13.getClass();
        r12 = r8.toLowerCase(r12);
        r12.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x022d, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.FlashAvailabilityBufferUnderflowQuirk.class, r5.contains(new defpackage.md2(r13, r12))) == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x022f, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x023f, code lost:
        if (androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk.a.contains(r8) == false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0245, code lost:
        if (r7.equalsIgnoreCase("Google") != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0247, code lost:
        r5 = android.os.Build.BRAND;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0250, code lost:
        if (r5.equalsIgnoreCase("Google") == false) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0254, code lost:
        if (r6 < 26) goto L287;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0256, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0258, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x025f, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.ImageCapturePixelHDRPlusQuirk.class, r5) == false) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0261, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0269, code lost:
        r5 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0271, code lost:
        if (r7.equalsIgnoreCase("Samsung") != false) goto L285;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0273, code lost:
        r5 = android.os.Build.BRAND;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x027c, code lost:
        if (r5.equalsIgnoreCase("Samsung") == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x027e, code lost:
        r5 = android.os.Build.ID;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0287, code lost:
        if (defpackage.xs6.g0(r5, "TP1A", true) == false) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x028b, code lost:
        r5 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.a;
        r13 = r8.toLowerCase(r9);
        r13.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0298, code lost:
        if (r5.contains(r13) == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x029a, code lost:
        r5 = android.os.Build.ID;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02a3, code lost:
        if (defpackage.xs6.g0(r5, "TP1A", true) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02a5, code lost:
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02ae, code lost:
        if (defpackage.xs6.g0(r5, "TD1A", true) == false) goto L260;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02b8, code lost:
        if (r7.equalsIgnoreCase("Redmi") != false) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x02ba, code lost:
        r13 = android.os.Build.BRAND;
        r13.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02c3, code lost:
        if (r13.equalsIgnoreCase("Redmi") == false) goto L264;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02c6, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02c8, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x02cd, code lost:
        if (r7.equalsIgnoreCase("Xiaomi") != false) goto L283;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x02cf, code lost:
        r13 = android.os.Build.BRAND;
        r13.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x02d8, code lost:
        if (r13.equalsIgnoreCase("Xiaomi") == false) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x02db, code lost:
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x02dd, code lost:
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x02df, code lost:
        if ((r5 | r13) == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x02e1, code lost:
        r5 = android.os.Build.ID;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x02ec, code lost:
        if (defpackage.xs6.g0(r5, "TKQ1", true) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x02ee, code lost:
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x02f5, code lost:
        if (defpackage.xs6.g0(r5, "TP1A", true) == false) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x02f8, code lost:
        r5 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.c;
        r12 = r8.toLowerCase(r9);
        r12.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0307, code lost:
        if (r5.contains(r12) == false) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0309, code lost:
        if (r6 != 33) goto L279;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x030c, code lost:
        r5 = androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.b;
        r13 = r8.toLowerCase(r9);
        r13.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0319, code lost:
        if (r5.contains(r13) == false) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x031b, code lost:
        if (r6 != 33) goto L282;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x031d, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x031f, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0326, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk.class, r5) == false) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0328, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0334, code lost:
        if (defpackage.nb3.E() != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x033a, code lost:
        if (defpackage.nb3.F() != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0340, code lost:
        if (defpackage.nb3.C() != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0346, code lost:
        if (defpackage.nb3.J() != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x034c, code lost:
        if (defpackage.nb3.I() != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x0352, code lost:
        if (defpackage.nb3.G() != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x0358, code lost:
        if (defpackage.nb3.H() != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x035e, code lost:
        if (defpackage.nb3.D() != false) goto L259;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x0364, code lost:
        if (defpackage.nb3.K() == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x0367, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0369, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x0370, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.ExcludedSupportedSizesQuirk.class, r5) == false) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:218:0x0372, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x037a, code lost:
        r5 = androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0386, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk.class, defpackage.n16.E()) == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0388, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x0396, code lost:
        if (r7.equalsIgnoreCase("Motorola") != false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x0398, code lost:
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03a1, code lost:
        if (r6.equalsIgnoreCase("Motorola") == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x03a9, code lost:
        if ("moto e5 play".equalsIgnoreCase(r8) == false) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03ab, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x03ad, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x03b4, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.ExtraSupportedOutputSizeQuirk.class, r5) == false) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x03b6, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x03be, code lost:
        r5 = androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.a;
        r5 = android.os.Build.DEVICE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x03c8, code lost:
        if ("heroqltevzw".equalsIgnoreCase(r5) != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x03d0, code lost:
        if ("heroqltetmo".equalsIgnoreCase(r5) == false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x03d7, code lost:
        if (defpackage.ge7.V() != false) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x03dd, code lost:
        if (defpackage.ge7.W() == false) goto L171;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x03e0, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x03e2, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x03e9, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk.class, r6) == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x03eb, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x03f3, code lost:
        r6 = androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x03f9, code lost:
        if (r7.equalsIgnoreCase("Google") != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x03fb, code lost:
        r6 = android.os.Build.BRAND;
        r6.getClass();
        r6.equalsIgnoreCase("Google");
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0409, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.Nexus4AndroidLTargetAspectRatioQuirk.class, false) == false) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x040b, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0413, code lost:
        r6 = androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0419, code lost:
        if (r7.equalsIgnoreCase("Google") != false) goto L252;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x041b, code lost:
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0424, code lost:
        if (r6.equalsIgnoreCase("Google") == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x0426, code lost:
        r6 = androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk.a;
        r5.getClass();
        r11 = java.util.Locale.getDefault();
        r11.getClass();
        r5 = r5.toLowerCase(r11);
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x043d, code lost:
        if (r6.contains(r5) == false) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x043f, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x0441, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0448, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk.class, r5) == false) goto L189;
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x044a, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:266:0x0458, code lost:
        if (r7.equalsIgnoreCase("Huawei") != false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x045a, code lost:
        r6 = android.os.Build.BRAND;
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0463, code lost:
        if (r6.equalsIgnoreCase("Huawei") == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x046b, code lost:
        if ("mha-l29".equalsIgnoreCase(r8) == false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:271:0x046d, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x046f, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0476, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk.class, r5) == false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0478, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x0484, code lost:
        if (r7.equalsIgnoreCase("Samsung") != false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x0486, code lost:
        r5 = android.os.Build.BRAND;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x048f, code lost:
        if (r5.equalsIgnoreCase("Samsung") == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0491, code lost:
        r5 = r8.toUpperCase(r9);
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x049e, code lost:
        if (defpackage.xs6.g0(r5, "SM-A716", false) == false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x04a0, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x04a2, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:285:0x04a9, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.StillCaptureFlashStopRepeatingQuirk.class, r5) == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x04ab, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x04b3, code lost:
        r5 = androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.a;
        r6 = r8.toLowerCase(r9);
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x04c6, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk.class, r5.contains(r6)) == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x04c8, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:290:0x04d0, code lost:
        r5 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:291:0x04d6, code lost:
        if (r7.equalsIgnoreCase("Samsung") != false) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:292:0x04d8, code lost:
        r5 = android.os.Build.BRAND;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:293:0x04e1, code lost:
        if (r5.equalsIgnoreCase("Samsung") == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x04e3, code lost:
        r5 = androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.a;
        r6 = android.os.Build.HARDWARE;
        r6.getClass();
        r11 = java.util.Locale.getDefault();
        r11.getClass();
        r6 = r6.toLowerCase(r11);
        r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x04fc, code lost:
        if (r5.contains(r6) == false) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x04fe, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0500, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0507, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.SurfaceOrderQuirk.class, r5) == false) goto L216;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0509, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0517, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.CaptureSessionOnClosedNotCalledQuirk.class, false) == false) goto L219;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x0519, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0521, code lost:
        r5 = androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:305:0x0527, code lost:
        if (r7.equalsIgnoreCase("Samsung") != false) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:306:0x0529, code lost:
        r5 = android.os.Build.BRAND;
        r5.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0532, code lost:
        if (r5.equalsIgnoreCase("Samsung") == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x053a, code lost:
        if (defpackage.dt7.b(androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.a) == false) goto L223;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0541, code lost:
        if (r7.equalsIgnoreCase("Xiaomi") != false) goto L238;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x0543, code lost:
        r4 = android.os.Build.BRAND;
        r4.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:314:0x054c, code lost:
        if (r4.equalsIgnoreCase("Xiaomi") == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0554, code lost:
        if (defpackage.dt7.b(androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.b) == false) goto L227;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0556, code lost:
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x055d, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.ZslDisablerQuirk.class, r2) == false) goto L230;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x055f, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0567, code lost:
        r2 = androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk.a;
        r3 = r8.toUpperCase(r9);
        r3.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x057a, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.SmallDisplaySizeQuirk.class, r2.containsKey(r3)) == false) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x057c, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x058c, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk.class, androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk.b) == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x058e, code lost:
        r0.add(androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x0593, code lost:
        defpackage.si1.a = new defpackage.y65(r0);
        defpackage.kj2.t("DeviceQuirks", "camera2 DeviceQuirks = ".concat(defpackage.y65.d(defpackage.si1.a())));
     */
    /* JADX WARN: Code restructure failed: missing block: B:328:0x05a9, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013a, code lost:
        if (r11.equalsIgnoreCase("Jio") != false) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0142, code lost:
        if (defpackage.xs6.g0(r8, "LS1542QW", true) != false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0149, code lost:
        if (r7.equalsIgnoreCase("Samsung") != false) goto L293;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x014b, code lost:
        r10 = android.os.Build.BRAND;
        r10.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0154, code lost:
        if (r10.equalsIgnoreCase("Samsung") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x015c, code lost:
        if (defpackage.xs6.g0(r8, "SM-A025", true) != false) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0164, code lost:
        if (r8.equalsIgnoreCase("SM-S124DL") == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x016b, code lost:
        if (r7.equalsIgnoreCase("Vivo") != false) goto L290;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x016d, code lost:
        r10 = android.os.Build.BRAND;
        r10.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0176, code lost:
        if (r10.equalsIgnoreCase("Vivo") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017e, code lost:
        if (r8.equalsIgnoreCase("VIVO 2039") == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0181, code lost:
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0183, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x018a, code lost:
        if (r15.a(androidx.camera.camera2.compat.quirk.ControlZoomRatioRangeAssertionErrorQuirk.class, r5) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x018c, code lost:
        r0.add(new java.lang.Object());
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0194, code lost:
        r5 = androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x019c, code lost:
        if (r7.equalsIgnoreCase("Tecno") != false) goto L289;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x019e, code lost:
        r10 = android.os.Build.BRAND;
        r10.getClass();
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0131  */
    @Override // defpackage.b31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        List list;
        String upperCase;
        String str;
        String str2;
        rq6 rq6Var;
        boolean z7 = false;
        switch (this.a) {
            case 0:
                if (obj == null) {
                    nj2.h();
                    throw null;
                }
                throw new ClassCastException();
            case 1:
                if (obj == null) {
                    nj2.h();
                    throw null;
                }
                throw new ClassCastException();
            case 2:
                ez ezVar = (ez) obj;
                nj2.h();
                return;
            case 3:
                v65 v65Var = (v65) obj;
                ArrayList arrayList = new ArrayList();
                String str3 = Build.BRAND;
                if (("HUAWEI".equalsIgnoreCase(str3) && "SNE-LX1".equalsIgnoreCase(Build.MODEL)) || ("HONOR".equalsIgnoreCase(str3) && "STK-LX1".equalsIgnoreCase(Build.MODEL))) {
                    z = true;
                } else {
                    z = false;
                }
                if (v65Var.a(ImageCaptureRotationOptionQuirk.class, z)) {
                    arrayList.add(new Object());
                }
                if (v65Var.a(SurfaceOrderQuirk.class, true)) {
                    arrayList.add(new Object());
                }
                HashSet hashSet = CaptureFailedRetryQuirk.a;
                Locale locale = Locale.US;
                String upperCase2 = str3.toUpperCase(locale);
                String str4 = Build.MODEL;
                if (v65Var.a(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.a.contains(Pair.create(upperCase2, str4.toUpperCase(locale))))) {
                    arrayList.add(new Object());
                }
                if (v65Var.a(LowMemoryQuirk.class, LowMemoryQuirk.a.contains(str4.toUpperCase(locale)))) {
                    arrayList.add(new Object());
                }
                HashSet hashSet2 = LargeJpegImageQuirk.a;
                if (!"Samsung".equalsIgnoreCase(str3) && (!"Vivo".equalsIgnoreCase(str3) || !LargeJpegImageQuirk.a.contains(str4.toUpperCase(locale)))) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (v65Var.a(LargeJpegImageQuirk.class, z2)) {
                    arrayList.add(new Object());
                }
                HashSet hashSet3 = IncorrectJpegMetadataQuirk.a;
                if ("Samsung".equalsIgnoreCase(str3) && IncorrectJpegMetadataQuirk.a.contains(Build.DEVICE.toUpperCase(locale))) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (v65Var.a(IncorrectJpegMetadataQuirk.class, z3)) {
                    arrayList.add(new Object());
                }
                HashSet hashSet4 = ImageCaptureFailedForSpecificCombinationQuirk.a;
                if (("oneplus".equalsIgnoreCase(str3) && "cph2583".equalsIgnoreCase(str4)) || ("google".equalsIgnoreCase(str3) && ImageCaptureFailedForSpecificCombinationQuirk.a.contains(str4.toLowerCase()))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (v65Var.a(ImageCaptureFailedForSpecificCombinationQuirk.class, z4)) {
                    arrayList.add(new Object());
                }
                PreviewGreenTintQuirk previewGreenTintQuirk = PreviewGreenTintQuirk.a;
                if ("motorola".equalsIgnoreCase(str3) && "moto e20".equalsIgnoreCase(str4)) {
                    z7 = true;
                }
                if (v65Var.a(PreviewGreenTintQuirk.class, z7)) {
                    arrayList.add(previewGreenTintQuirk);
                }
                ri1.a = new y65(arrayList);
                kj2.t("DeviceQuirks", "core DeviceQuirks = ".concat(y65.d(ri1.a)));
                return;
            case 4:
                v65 v65Var2 = (v65) obj;
                v65Var2.getClass();
                ArrayList arrayList2 = new ArrayList();
                int i = PixelJpegRSupportedQuirk.b;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 34) {
                    y10 y10Var = (y10) BackportedFixQuirk.a.getValue();
                    oi3 oi3Var = qi3.a;
                    y10Var.getClass();
                    oi3Var.getClass();
                    if (((Boolean) oi3Var.c.c()).booleanValue()) {
                        if (oi3Var.b.contains(Build.FINGERPRINT)) {
                            rq6Var = rq6.Fixed;
                        } else {
                            s35 s35Var = y10Var.a;
                            s35Var.getClass();
                            if (((Set) ((ex6) s35Var.A).getValue()).contains(5)) {
                                rq6Var = rq6.Fixed;
                            } else {
                                rq6Var = rq6.NotFixed;
                            }
                        }
                    } else {
                        rq6Var = rq6.NotApplicable;
                    }
                    int i3 = x10.a[rq6Var.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2 && i3 != 3) {
                            if (i3 != 4) {
                                i.d();
                                return;
                            }
                        }
                    }
                    z5 = true;
                    if (v65Var2.a(PixelJpegRSupportedQuirk.class, z5)) {
                        arrayList2.add(new Object());
                    }
                    if (!CloseCameraDeviceOnCameraGraphCloseQuirk.a && !CloseCameraDeviceOnCameraGraphCloseQuirk.b && (30 > i2 || i2 >= 34 || (!lb4.A("Oppo") && !lb4.A("OnePlus") && !lb4.A("Realme")))) {
                        str2 = Build.MANUFACTURER;
                        str2.getClass();
                        if (!str2.equalsIgnoreCase("Vivo")) {
                            String str5 = Build.BRAND;
                            str5.getClass();
                            if (!str5.equalsIgnoreCase("Vivo") && !CloseCameraDeviceOnCameraGraphCloseQuirk.c && !CloseCameraDeviceOnCameraGraphCloseQuirk.e && !CloseCameraDeviceOnCameraGraphCloseQuirk.d) {
                                z6 = false;
                                if (v65Var2.a(CloseCameraDeviceOnCameraGraphCloseQuirk.class, z6)) {
                                    arrayList2.add(new Object());
                                }
                                list = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.a;
                                String str6 = Build.MODEL;
                                str6.getClass();
                                Locale locale2 = Locale.ROOT;
                                upperCase = str6.toUpperCase(locale2);
                                upperCase.getClass();
                                if (v65Var2.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, list.contains(upperCase))) {
                                    arrayList2.add(new Object());
                                }
                                str = Build.MANUFACTURER;
                                str.getClass();
                                if (!str.equalsIgnoreCase("Jio")) {
                                    String str7 = Build.BRAND;
                                    str7.getClass();
                                    break;
                                }
                                break;
                            }
                        }
                    }
                    z6 = true;
                    if (v65Var2.a(CloseCameraDeviceOnCameraGraphCloseQuirk.class, z6)) {
                    }
                    list = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.a;
                    String str62 = Build.MODEL;
                    str62.getClass();
                    Locale locale22 = Locale.ROOT;
                    upperCase = str62.toUpperCase(locale22);
                    upperCase.getClass();
                    if (v65Var2.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, list.contains(upperCase))) {
                    }
                    str = Build.MANUFACTURER;
                    str.getClass();
                    if (!str.equalsIgnoreCase("Jio")) {
                    }
                }
                z5 = false;
                if (v65Var2.a(PixelJpegRSupportedQuirk.class, z5)) {
                }
                if (!CloseCameraDeviceOnCameraGraphCloseQuirk.a) {
                    str2 = Build.MANUFACTURER;
                    str2.getClass();
                    if (!str2.equalsIgnoreCase("Vivo")) {
                    }
                }
                z6 = true;
                if (v65Var2.a(CloseCameraDeviceOnCameraGraphCloseQuirk.class, z6)) {
                }
                list = CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.a;
                String str622 = Build.MODEL;
                str622.getClass();
                Locale locale222 = Locale.ROOT;
                upperCase = str622.toUpperCase(locale222);
                upperCase.getClass();
                if (v65Var2.a(CrashWhenTakingPhotoWithAutoFlashAEModeQuirk.class, list.contains(upperCase))) {
                }
                str = Build.MANUFACTURER;
                str.getClass();
                if (!str.equalsIgnoreCase("Jio")) {
                }
                break;
            default:
                Set set = (Set) obj;
                return;
        }
    }

    public /* synthetic */ hk0(bt btVar, int i) {
        this.a = i;
    }
}
