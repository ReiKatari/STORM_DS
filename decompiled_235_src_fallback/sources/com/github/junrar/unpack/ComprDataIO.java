package com.github.junrar.unpack;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ComprDataIO {
    private final com.github.junrar.Archive archive;
    private long curPackRead;
    private long curPackWrite;
    private long curUnpRead;
    private long curUnpWrite;
    private int decryption;
    private int encryption;
    private boolean nextVolumeMissing;
    private java.io.OutputStream outputStream;
    private long packFileCRC;
    private boolean packVolume;
    private long packedCRC;
    private long processedArcSize;
    private boolean skipUnpCRC;
    private com.github.junrar.rarfile.FileHeader subHead;
    private boolean testMode;
    private long totalArcSize;
    private long totalPackRead;
    private com.github.junrar.io.RawDataIo underlyingDataIo;
    private long unpArcSize;
    private long unpFileCRC;
    private long unpPackedSize;
    private boolean unpVolume;

    public ComprDataIO(com.github.junrar.Archive r1) {
            r0 = this;
            r0.<init>()
            r0.archive = r1
            return
    }

    public long getCurPackRead() {
            r2 = this;
            long r0 = r2.curPackRead
            return r0
    }

    public long getCurPackWrite() {
            r2 = this;
            long r0 = r2.curPackWrite
            return r0
    }

    public long getCurUnpRead() {
            r2 = this;
            long r0 = r2.curUnpRead
            return r0
    }

    public long getCurUnpWrite() {
            r2 = this;
            long r0 = r2.curUnpWrite
            return r0
    }

    public int getDecryption() {
            r0 = this;
            int r0 = r0.decryption
            return r0
    }

    public int getEncryption() {
            r0 = this;
            int r0 = r0.encryption
            return r0
    }

    public long getPackFileCRC() {
            r2 = this;
            long r0 = r2.packFileCRC
            return r0
    }

    public long getPackedCRC() {
            r2 = this;
            long r0 = r2.packedCRC
            return r0
    }

    public long getProcessedArcSize() {
            r2 = this;
            long r0 = r2.processedArcSize
            return r0
    }

    public com.github.junrar.rarfile.FileHeader getSubHeader() {
            r0 = this;
            com.github.junrar.rarfile.FileHeader r0 = r0.subHead
            return r0
    }

    public long getTotalArcSize() {
            r2 = this;
            long r0 = r2.totalArcSize
            return r0
    }

    public long getTotalPackRead() {
            r2 = this;
            long r0 = r2.totalPackRead
            return r0
    }

    public long getUnpArcSize() {
            r2 = this;
            long r0 = r2.unpArcSize
            return r0
    }

    public long getUnpFileCRC() {
            r2 = this;
            long r0 = r2.unpFileCRC
            return r0
    }

    public void init(com.github.junrar.rarfile.FileHeader r5) {
            r4 = this;
            long r0 = r5.getPositionInFile()
            com.github.junrar.Archive r2 = r4.archive
            boolean r2 = r2.isEncrypted()
            short r2 = r5.getHeaderSize(r2)
            long r2 = (long) r2
            long r0 = r0 + r2
            long r2 = r5.getFullPackSize()
            r4.unpPackedSize = r2
            com.github.junrar.Archive r2 = r4.archive
            com.github.junrar.io.SeekableReadOnlyByteChannel r2 = r2.getChannel()
            r2.setPosition(r0)
            com.github.junrar.io.RawDataIo r0 = new com.github.junrar.io.RawDataIo
            com.github.junrar.Archive r1 = r4.archive
            com.github.junrar.io.SeekableReadOnlyByteChannel r1 = r1.getChannel()
            r0.<init>(r1)
            r4.underlyingDataIo = r0
            r4.subHead = r5
            r0 = 0
            r4.curUnpRead = r0
            r4.curPackWrite = r0
            r0 = -1
            r4.packedCRC = r0
            boolean r0 = r5.isEncrypted()
            if (r0 == 0) goto L59
            com.github.junrar.Archive r0 = r4.archive     // Catch: java.lang.Exception -> L52
            java.lang.String r0 = r0.getPassword()     // Catch: java.lang.Exception -> L52
            byte[] r5 = r5.getSalt()     // Catch: java.lang.Exception -> L52
            javax.crypto.Cipher r5 = com.github.junrar.crypt.Rijndael.buildDecipherer(r0, r5)     // Catch: java.lang.Exception -> L52
            com.github.junrar.io.RawDataIo r4 = r4.underlyingDataIo     // Catch: java.lang.Exception -> L52
            r4.setCipher(r5)     // Catch: java.lang.Exception -> L52
            return
        L52:
            r4 = move-exception
            com.github.junrar.exception.InitDeciphererFailedException r5 = new com.github.junrar.exception.InitDeciphererFailedException
            r5.<init>(r4)
            throw r5
        L59:
            return
    }

    public void init(java.io.OutputStream r5) {
            r4 = this;
            r4.outputStream = r5
            r0 = 0
            r4.unpPackedSize = r0
            r5 = 0
            r4.testMode = r5
            r4.skipUnpCRC = r5
            r4.packVolume = r5
            r4.unpVolume = r5
            r4.nextVolumeMissing = r5
            r4.encryption = r5
            r4.decryption = r5
            r4.totalPackRead = r0
            r4.curUnpWrite = r0
            r4.curUnpRead = r0
            r4.curPackWrite = r0
            r4.curPackRead = r0
            r2 = -1
            r4.packedCRC = r2
            r4.unpFileCRC = r2
            r4.packFileCRC = r2
            r5 = 0
            r4.subHead = r5
            r4.totalArcSize = r0
            r4.processedArcSize = r0
            return
    }

    public boolean isNextVolumeMissing() {
            r0 = this;
            boolean r0 = r0.nextVolumeMissing
            return r0
    }

    public boolean isPackVolume() {
            r0 = this;
            boolean r0 = r0.packVolume
            return r0
    }

    public boolean isUnpVolume() {
            r0 = this;
            boolean r0 = r0.unpVolume
            return r0
    }

    public void setCurPackRead(long r1) {
            r0 = this;
            r0.curPackRead = r1
            return
    }

    public void setCurPackWrite(long r1) {
            r0 = this;
            r0.curPackWrite = r1
            return
    }

    public void setCurUnpRead(long r1) {
            r0 = this;
            r0.curUnpRead = r1
            return
    }

    public void setCurUnpWrite(long r1) {
            r0 = this;
            r0.curUnpWrite = r1
            return
    }

    public void setDecryption(int r1) {
            r0 = this;
            r0.decryption = r1
            return
    }

    public void setEncryption(int r1) {
            r0 = this;
            r0.encryption = r1
            return
    }

    public void setNextVolumeMissing(boolean r1) {
            r0 = this;
            r0.nextVolumeMissing = r1
            return
    }

    public void setPackFileCRC(long r1) {
            r0 = this;
            r0.packFileCRC = r1
            return
    }

    public void setPackVolume(boolean r1) {
            r0 = this;
            r0.packVolume = r1
            return
    }

    public void setPackedCRC(long r1) {
            r0 = this;
            r0.packedCRC = r1
            return
    }

    public void setPackedSizeToRead(long r1) {
            r0 = this;
            r0.unpPackedSize = r1
            return
    }

    public void setProcessedArcSize(long r1) {
            r0 = this;
            r0.processedArcSize = r1
            return
    }

    public void setSkipUnpCRC(boolean r1) {
            r0 = this;
            r0.skipUnpCRC = r1
            return
    }

    public void setSubHeader(com.github.junrar.rarfile.FileHeader r1) {
            r0 = this;
            r0.subHead = r1
            return
    }

    public void setTestMode(boolean r1) {
            r0 = this;
            r0.testMode = r1
            return
    }

    public void setTotalArcSize(long r1) {
            r0 = this;
            r0.totalArcSize = r1
            return
    }

    public void setTotalPackRead(long r1) {
            r0 = this;
            r0.totalPackRead = r1
            return
    }

    public void setUnpArcSize(long r1) {
            r0 = this;
            r0.unpArcSize = r1
            return
    }

    public void setUnpFileCRC(long r1) {
            r0 = this;
            r0.unpFileCRC = r1
            return
    }

    public void setUnpVolume(boolean r1) {
            r0 = this;
            r0.unpVolume = r1
            return
    }

    public int unpRead(byte[] r11, int r12, int r13) {
            r10 = this;
            r0 = 0
            r1 = r0
            r2 = r1
        L3:
            r3 = -1
            if (r13 <= 0) goto Lb0
            long r4 = (long) r13
            long r6 = r10.unpPackedSize
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 <= 0) goto Lf
            int r2 = (int) r6
            goto L10
        Lf:
            r2 = r13
        L10:
            com.github.junrar.io.RawDataIo r4 = r10.underlyingDataIo
            int r2 = r4.read(r11, r12, r2)
            if (r2 < 0) goto Lac
            com.github.junrar.rarfile.FileHeader r4 = r10.subHead
            boolean r4 = r4.isSplitAfter()
            if (r4 == 0) goto L2a
            long r4 = r10.packedCRC
            int r4 = (int) r4
            int r4 = com.github.junrar.crc.RarCRC.checkCrc(r4, r11, r12, r2)
            long r4 = (long) r4
            r10.packedCRC = r4
        L2a:
            int r1 = r1 + r2
            int r13 = r13 - r2
            int r12 = r12 + r2
            long r4 = r10.unpPackedSize
            long r6 = (long) r2
            long r4 = r4 - r6
            r10.unpPackedSize = r4
            long r4 = r10.curUnpRead
            long r4 = r4 + r6
            r10.curUnpRead = r4
            com.github.junrar.Archive r4 = r10.archive
            r4.bytesReadRead(r2)
            long r4 = r10.unpPackedSize
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto Lb0
            com.github.junrar.rarfile.FileHeader r4 = r10.subHead
            boolean r4 = r4.isSplitAfter()
            if (r4 == 0) goto Lb0
            com.github.junrar.Archive r4 = r10.archive
            com.github.junrar.volume.VolumeManager r4 = r4.getVolumeManager()
            com.github.junrar.Archive r5 = r10.archive
            com.github.junrar.volume.Volume r6 = r5.getVolume()
            com.github.junrar.volume.Volume r4 = r4.nextVolume(r5, r6)
            if (r4 != 0) goto L63
            r11 = 1
            r10.nextVolumeMissing = r11
            return r3
        L63:
            com.github.junrar.rarfile.FileHeader r5 = r10.getSubHeader()
            byte r6 = r5.getUnpVersion()
            r7 = 20
            if (r6 < r7) goto L8a
            int r6 = r5.getFileCRC()
            if (r6 == r3) goto L8a
            long r6 = r10.getPackedCRC()
            int r5 = r5.getFileCRC()
            int r5 = ~r5
            long r8 = (long) r5
            int r5 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r5 != 0) goto L84
            goto L8a
        L84:
            com.github.junrar.exception.CrcErrorException r10 = new com.github.junrar.exception.CrcErrorException
            r10.<init>()
            throw r10
        L8a:
            com.github.junrar.Archive r5 = r10.archive
            com.github.junrar.UnrarCallback r5 = r5.getUnrarCallback()
            if (r5 == 0) goto L99
            boolean r5 = r5.isNextVolumeReady(r4)
            if (r5 != 0) goto L99
            return r3
        L99:
            com.github.junrar.Archive r5 = r10.archive
            r5.setVolume(r4)
            com.github.junrar.Archive r4 = r10.archive
            com.github.junrar.rarfile.FileHeader r4 = r4.nextFileHeader()
            if (r4 != 0) goto La7
            return r3
        La7:
            r10.init(r4)
            goto L3
        Lac:
            defpackage.i.n()
            return r0
        Lb0:
            if (r2 == r3) goto Lb3
            return r1
        Lb3:
            return r2
    }

    public void unpWrite(byte[] r5, int r6, int r7) {
            r4 = this;
            boolean r0 = r4.testMode
            if (r0 != 0) goto L9
            java.io.OutputStream r0 = r4.outputStream
            r0.write(r5, r6, r7)
        L9:
            long r0 = r4.curUnpWrite
            long r2 = (long) r7
            long r0 = r0 + r2
            r4.curUnpWrite = r0
            boolean r0 = r4.skipUnpCRC
            if (r0 != 0) goto L2f
            com.github.junrar.Archive r0 = r4.archive
            boolean r0 = r0.isOldFormat()
            long r1 = r4.unpFileCRC
            if (r0 == 0) goto L27
            int r6 = (int) r1
            short r6 = (short) r6
            short r5 = com.github.junrar.crc.RarCRC.checkOldCrc(r6, r5, r7)
            long r5 = (long) r5
            r4.unpFileCRC = r5
            return
        L27:
            int r0 = (int) r1
            int r5 = com.github.junrar.crc.RarCRC.checkCrc(r0, r5, r6, r7)
            long r5 = (long) r5
            r4.unpFileCRC = r5
        L2f:
            return
    }
}
