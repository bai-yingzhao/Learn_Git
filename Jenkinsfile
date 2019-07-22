echo 'Hello Mr.'
int BATCH_COUNT = 8
int FORK_COUNT = 8
def serenityBatches = [:]

for (int i = 1; i <= BATCH_COUNT; i++) {
    def batchNumber = i
    def batchName = "batch-${batchNumber}"

    serenityBatches[batchName] = {
        node {
            checkout scm
            try {
			echo 'Hello Mr.'
               
            } catch (Throwable e) {
                throw e
            } finally {
                stash name: batchName,           
                    allowEmpty: true
            }
        }
    }
}

stage("automated tests") {
    parallel serenityBatches
}

stage("report aggregation") {
    node {
        // unstash each of the batches

        for (batchNumber in BATCH_COUNT) {
            def batchName = "batch-${batchNumber}"
            echo "Unstashing serenity reports for ${batchName}"
            unstash batchName
        }

        // publish the Serenity report

        )
    }
}