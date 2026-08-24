package com.google.android.libraries.vision.visionkit.pipeline.alt;

import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbko;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class PipelineException extends Exception {
    private static final String ROOT_CAUSE_DELIMITER = "#vk ";
    private final k18 statusCode;
    private final String statusMessage;
    private final b28 visionkitStatus;

    private PipelineException(b28 b28Var) {
        super(lb1.m(k18.values()[b28Var.a()].zba(), ": ", b28Var.c()));
        this.statusCode = k18.values()[b28Var.a()];
        this.statusMessage = b28Var.c();
        this.visionkitStatus = b28Var;
    }

    public List<h08> getComponentStatuses() {
        b28 b28Var = this.visionkitStatus;
        if (b28Var != null) {
            return b28Var.zbf();
        }
        return zbkx.zbh();
    }

    public zbki<String> getRootCauseMessage() {
        Object next;
        Object obj;
        if (this.statusMessage.contains(ROOT_CAUSE_DELIMITER)) {
            List zbb = zbko.zba(ROOT_CAUSE_DELIMITER).zbb(this.statusMessage);
            if (zbb != null) {
                if (!zbb.isEmpty()) {
                    obj = zbb.get(zbb.size() - 1);
                } else {
                    fa6.c();
                    return null;
                }
            } else {
                Iterator it = zbb.iterator();
                do {
                    next = it.next();
                } while (it.hasNext());
                obj = next;
            }
            return zbki.zbe((String) obj);
        }
        return zbki.zbd();
    }

    public k18 getStatusCode() {
        return this.statusCode;
    }

    public String getStatusMessage() {
        return this.statusMessage;
    }

    public PipelineException(int i, String str) {
        super(lb1.m(k18.values()[i].zba(), ": ", str));
        this.statusCode = k18.values()[i];
        this.statusMessage = str;
        this.visionkitStatus = null;
    }

    public PipelineException(byte[] bArr) {
        this(b28.b(bArr, zbtp.zba()));
    }
}
